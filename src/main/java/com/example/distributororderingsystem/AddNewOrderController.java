package com.example.distributororderingsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AddNewOrderController implements Initializable {

    @FXML
    private Button homeButton;
    @FXML
    private Button customerListButton;
    @FXML
    private Button orderListButton;
    @FXML
    private Button inventoryButton;
    @FXML
    private Button logoutButton;
    @FXML
    private Button saveButton;
    @FXML
    private Button cancelButton;

    @FXML
    private TextField accountIDField;
    @FXML
    private TextField deliveryDateField;
    @FXML
    private TextField salesRepIDField;
    @FXML
    private TextField deliveryRepIDField;

    @FXML
    private TableView<Item> itemsTableView;
    @FXML
    private TableColumn<Item, String> itemIDColumn;
    @FXML
    private TableColumn<Item, String> itemNameColumn;
    @FXML
    private TableColumn<Item, Integer> quantityColumn;

    private final ObservableList<Item> itemList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        itemIDColumn.setCellValueFactory(new PropertyValueFactory<>("itemID"));
        itemNameColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        itemsTableView.setItems(itemList);

        customerListButton.setOnAction(event -> {
            try {
                Controller.changeScene(event, "customer-list-screen.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        orderListButton.setOnAction(event -> {
            try {
                Controller.changeScene(event, "order-list-screen.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        inventoryButton.setOnAction(event -> {
            try {
                Controller.changeScene(event, "inventory-screen.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        logoutButton.setOnAction(event -> {
            try {
                Controller.changeScene(event, "login-screen.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        saveButton.setOnAction(event -> {
            saveOrder();
            try {
                Controller.changeScene(event, "order-confirmation-screen.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        cancelButton.setOnAction(event -> {
            try {
                Controller.changeScene(event, "order-list-screen.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

    }

    private void saveOrder() {
        String accountID = accountIDField.getText();
        String deliveryDate = deliveryDateField.getText();
        String salesRepID = salesRepIDField.getText();
        String deliveryRepID = deliveryRepIDField.getText();

        Order newOrder = new Order(accountID, deliveryDate, salesRepID, deliveryRepID, new ArrayList<>(itemList));

        // Save the order to the desired location (e.g., database, file, etc.)
        // For now, let's print it to the console to confirm
        System.out.println(newOrder);
    }

    public static class Item {
        private final String itemID;
        private final String itemName;
        private final int quantity;

        public Item(String itemID, String itemName, int quantity) {
            this.itemID = itemID;
            this.itemName = itemName;
            this.quantity = quantity;
        }

        public String getItemID() {
            return itemID;
        }

        public String getItemName() {
            return itemName;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    public static class Order {
        private final String accountID;
        private final String deliveryDate;
        private final String salesRepID;
        private final String deliveryRepID;
        private final List<Item> items;

        public Order(String accountID, String deliveryDate, String salesRepID, String deliveryRepID, List<Item> items) {
            this.accountID = accountID;
            this.deliveryDate = deliveryDate;
            this.salesRepID = salesRepID;
            this.deliveryRepID = deliveryRepID;
            this.items = items;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "accountID='" + accountID + '\'' +
                    ", deliveryDate='" + deliveryDate + '\'' +
                    ", salesRepID='" + salesRepID + '\'' +
                    ", deliveryRepID='" + deliveryRepID + '\'' +
                    ", items=" + items +
                    '}';
        }
    }
}
