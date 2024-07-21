package com.example.distributororderingsystem;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;


public class InventoryItem {
    private String productID;
    private String itemDescription;
    private String supplierName;
    private String brandName;
    private String subName;
    private String productDescription;
    private String containerName;
    private String sizeDescription;
    private String extendedProductDescription;
    private String productClassDescription;
    private int onHand;
    private int salesCurrent;
    private String dateLastReceived;

    public InventoryItem(String productID, String itemDescription, String supplierName, String brandName, String subName
            , String productDescription, String containerName, String sizeDescription, String extendedProductDescription
            , String productClassDescription, int onHand, int salesCurrent, String dateLastReceived) {
        this.productID = productID;
        this.itemDescription = itemDescription;
        this.brandName = brandName;
        this.supplierName = supplierName;
        this.subName = subName;
        this.productDescription = productDescription;
        this.containerName = containerName;
        this.sizeDescription = sizeDescription;
        this.extendedProductDescription = extendedProductDescription;
        this.productClassDescription = productClassDescription;
        this.onHand = onHand;
        this.salesCurrent = salesCurrent;
        this.dateLastReceived = dateLastReceived;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public String getSizeDescription() {
        return sizeDescription;
    }

    public void setSizeDescription(String sizeDescription) {
        this.sizeDescription = sizeDescription;
    }

    public String getExtendedProductDescription() {
        return extendedProductDescription;
    }

    public void setExtendedProductDescription(String extendedProductDescription) {
        this.extendedProductDescription = extendedProductDescription;
    }

    public String getProductClassDescription() {
        return productClassDescription;
    }

    public void setProductClassDescription(String productClassDescription) {
        this.productClassDescription = productClassDescription;
    }

    public int getOnHand() {
        return onHand;
    }

    public void setOnHand(int onHand) {
        this.onHand = onHand;
    }

    public int getSalesCurrent() {
        return salesCurrent;
    }

    public void setSalesCurrent(int salesCurrent) {
        this.salesCurrent = salesCurrent;
    }

    public String getDateLastReceived() {
        return dateLastReceived;
    }

    public void setDateLastReceived(String dateLastReceived) {
        this.dateLastReceived = dateLastReceived;
    }



    public static InventoryItem fetchItemFromInventoryDatabase(String itemId) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Reading inventory.json into a Map
            Map<String, Object> inventoryData = mapper.readValue(new File("data/inventory.json"),
                    new TypeReference<Map<String, Object>>() {});
            // Find the item based on the itemId
            for (Map<String, Object> item : (List<Map<String, Object>>) inventoryData.get("items")) {
                if (item.get("Product ID").equals(itemId)) {
                    return new InventoryItem(
                            (String) item.get("Product ID "),
                            (String) item.get("Item Description "),
                            (String) item.get("Supplier Name "),
                            (String) item.get("Brand Name "),
                            (String) item.get("Sub Name "),
                            (String) item.get("Product Description "),
                            (String) item.get("Container Name "),
                            (String) item.get("Size Description "),
                            (String) item.get("Extended Product Description"),
                            (String) item.get("Product Class Description"),
                            (Integer) item.get("On Hand  "),
                            (Integer) item.get("Sales Current "),
                            (String) item.get("Date Last Received")
                    );
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "itemId='" + productID + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", brandName='" + brandName + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", productClassDescription='" + productClassDescription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InventoryItem that = (InventoryItem) o;

        if (productID != null ? !productID.equals(that.productID) : that.productID != null) return false;
        if (itemDescription != null ? !itemDescription.equals(that.itemDescription) : that.itemDescription != null)
            return false;
        if (brandName != null ? !brandName.equals(that.brandName) : that.brandName != null) return false;
        if (supplierName != null ? !supplierName.equals(that.supplierName) : that.supplierName != null) return false;
        return productClassDescription != null ? productClassDescription.equals(that.productClassDescription) : that.productClassDescription == null;
    }

    @Override
    public int hashCode() {
        int result = productID != null ? productID.hashCode() : 0;
        result = 31 * result + (itemDescription != null ? itemDescription.hashCode() : 0);
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        result = 31 * result + (supplierName != null ? supplierName.hashCode() : 0);
        result = 31 * result + (productClassDescription != null ? productClassDescription.hashCode() : 0);
        return result;
    }

}
