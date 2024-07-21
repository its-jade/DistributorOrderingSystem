package com.example.distributororderingsystem;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String accountID;
    private String deliveryDate;
    private String salesRepID;
    private String deliveryRepID;
    private List<InventoryItem> itemList;
    private String status;

    public Order() {
        this.itemList = new ArrayList<>();
    }
    public Order(String accountID, String deliveryDate, String salesRepID, String deliveryRepID, List<InventoryItem>
            itemList) {
        this.accountID = accountID;
        this.deliveryDate = deliveryDate;
        this.salesRepID = salesRepID;
        this.deliveryRepID = deliveryRepID;
        this.itemList = itemList;
    }
    public String getAccountID() {
        return accountID;
    }
    public String getDeliveryDate() {
        return deliveryDate;
    }
    public String getSalesRepID() {
        return salesRepID;
    }
    public String getDeliveryRepID() {
        return deliveryRepID;
    }
    public List<InventoryItem> getItemList() {
        return itemList;
    }
    public String getStatus() {
        return status;
    }
    public void addItem(String productID) {
        InventoryItem item = InventoryItem.fetchItemFromInventoryDatabase(productID);
        if (item != null) {
            this.itemList.add(item);
        }
        }

    //submitOrder is probably where the Writer needs to go to print out the completed order.

    public void confirmOrder() {
        this.status = "Confirmed";
    }
    public void submitOrder() {
        this.status = "submitted";
    }
    public List<InventoryItem> getItems() {
        return itemList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "accountID='" + accountID + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", salesRepID='" + salesRepID + '\'' +
                ", deliveryRepID='" + deliveryRepID + '\'' +
                ", itemList=" + itemList +
                ", status='" + status + '\'' +
                '}';
}