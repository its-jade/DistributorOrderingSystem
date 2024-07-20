package com.example.distributororderingsystem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String accountID;
    private int deliveryDate;//Assuming the date will be in YYYYMMDD format.  Or should I do String?  Or something else?
    private String salesRepID;
    private String deliveryRepID;
    private List<Item> itemList;
    private String status;

    public Order() {
        this.itemList = new ArrayList<>();
    }
    public Order(String accountID, int deliveryDate, String salesRepID, String deliveryRepID, List<Item> itemList) {
        this.accountID = accountID;
        this.deliveryDate = deliveryDate;
        this.salesRepID = salesRepID;
        this.deliveryRepID = deliveryRepID;
        this.itemList = itemList;
    }
    public String getAccountID() {
        return accountID;
    }
    public int getDeliveryDate() {
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
    /* This is the part of the code that needs access to the item database.  Can be edited depending on how that's made
       but I wanted to put something in the meantime.

    public void addItem(String itemID) {
        Item item = Item.fetchItemFromDatabase(itemID);
        this.itemList.add(item);
        }
     */


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