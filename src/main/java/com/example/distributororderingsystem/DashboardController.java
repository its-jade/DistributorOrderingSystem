package com.example.distributororderingsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class DashboardController implements Initializable {
    // buttons
    @FXML
    private Button customerListButton;
    @FXML
    private Button orderListButton;
    @FXML
    private Button inventoryButton;
    @FXML
    private Button logoutButton;
    @FXML
    private Button newOrderButton;
    @FXML
    private Button newCustomerButton;

    // Recent Order Table
    @FXML
    private TableView<Order> recentOrderTable;
    @FXML
    private TableColumn<Order, String> accountIDColumn;
    @FXML
    private TableColumn<Order, String> deliveryRepIDColumn;
    @FXML
    private TableColumn<Order, String> orderNumberColumn;
    @FXML
    private TableColumn<Order, String> deliveryDateColumn;


    // methods for button functionality
    // adding methods for Order Table functionality
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // Order Table Functionality Section
        /* Currently commented out as it breaks the login screen

        accountIDColumn.setCellValueFactory(new PropertyValueFactory<>("accountID"));
        deliveryRepIDColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryRepID"));
        orderNumberColumn.setCellValueFactory(new PropertyValueFactory<>("orderNumber"));
        deliveryDateColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));


        try {
            List<Order> orders = JSONHelper.readOrders();
            Collections.sort(orders, Comparator.comparing(Order::getDeliveryDate));
            ObservableList<Order> data = FXCollections.observableArrayList(orders.subList(0, Math.min(10,
                    orders.size())));
            recentOrderTable.setItems(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

        // Button section
        customerListButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Controller.changeScene(event, "customer-list-screen.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        orderListButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Controller.changeScene(event, "order-list-screen.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        inventoryButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Controller.changeScene(event, "inventory-screen.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        logoutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Controller.changeScene(event, "login-screen.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        newOrderButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Controller.changeScene(event, "add-new-order-screen.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        newCustomerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Controller.changeScene(event, "add-new-customer-screen.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}