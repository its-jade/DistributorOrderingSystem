package com.example.distributororderingsystem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String accountID;
    private String deliveryDate;
    private String salesRepID;
    private String deliveryRepID;
    private List<Item> itemList;
    private String status;

    public Order() {
        this.itemList = new ArrayList<>();
    }
    public Order(String accountID, String deliveryDate, String salesRepID, String deliveryRepID, List<Item> itemList) {
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
    public List<Item> getItemList() {
        return itemList;
    }
    public String getStatus() {
        return status;
    }
     public void addItem(String itemID) {
        /*
        placeholder for actual item retrieval
        Item item = Item.fetchItemFromDatabase(itemID);
        this.itemList.add(item);
        */
        }


    //submitOrder is probably where the Writer needs to go to print out the completed order.

    public void confirmOrder() {
        this.status = "Confirmed";
    }
    public void submitOrder() {
        this.status = "submitted";
    }
    public List<Item> getItems() {
        return itemList;
    }
}