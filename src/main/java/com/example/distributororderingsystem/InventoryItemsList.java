package com.example.distributororderingsystem;
import java.util.ArrayList;
import java.util.List;
public class InventoryItemsList {
    public static List<InventoryItem> generateInventoryItems() {
        List<InventoryItem> items = new ArrayList<>();

        for (int i = 1; i <= 300; i++) {
            items.add(new InventoryItem(
                    "ProductID" + i,
                    "ItemDescription" + i,
                    "SupplierName" + i,
                    "BrandName" + i,
                    "SubName" + i,
                    "ProductDescription" + i,
                    "ContainerName" + i,
                    "SizeDescription" + i,
                    "ExtendedProductDescription" + i,
                    "ProductClassDescription" + i,
                    i * 10,
                    i * 5,
                    "2024-07-21"
            ));
        }

        return items;
    }

    public static void main(String[] args) {
        List<InventoryItem> inventoryItems = generateInventoryItems();

        // Print out the inventory items to verify
        for (InventoryItem item : inventoryItems) {
            System.out.println(item);
        }
    }
}
