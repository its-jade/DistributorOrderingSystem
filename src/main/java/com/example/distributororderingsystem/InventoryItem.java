package com.example.distributororderingsystem;
public class InventoryItem {

    private String itemId;
    private String itemDescription;
    private String brandName;
    private String supplierName;
    private String itemClassDescription;

    public InventoryItem(String itemId, String itemDescription, String brandName, String supplierName, String itemClassDescription) {
        this.itemId = itemId;
        this.itemDescription = itemDescription;
        this.brandName = brandName;
        this.supplierName = supplierName;
        this.itemClassDescription = itemClassDescription;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getItemClassDescription() {
        return itemClassDescription;
    }

    public void setItemClassDescription(String itemClassDescription) {
        this.itemClassDescription = itemClassDescription;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "itemId='" + itemId + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", brandName='" + brandName + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", itemClassDescription='" + itemClassDescription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InventoryItem that = (InventoryItem) o;

        if (itemId != null ? !itemId.equals(that.itemId) : that.itemId != null) return false;
        if (itemDescription != null ? !itemDescription.equals(that.itemDescription) : that.itemDescription != null)
            return false;
        if (brandName != null ? !brandName.equals(that.brandName) : that.brandName != null) return false;
        if (supplierName != null ? !supplierName.equals(that.supplierName) : that.supplierName != null) return false;
        return itemClassDescription != null ? itemClassDescription.equals(that.itemClassDescription) : that.itemClassDescription == null;
    }

    @Override
    public int hashCode() {
        int result = itemId != null ? itemId.hashCode() : 0;
        result = 31 * result + (itemDescription != null ? itemDescription.hashCode() : 0);
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        result = 31 * result + (supplierName != null ? supplierName.hashCode() : 0);
        result = 31 * result + (itemClassDescription != null ? itemClassDescription.hashCode() : 0);
        return result;
    }
}

