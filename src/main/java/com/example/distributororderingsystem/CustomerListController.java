package com.example.distributororderingsystem;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class CustomerListController implements Initializable {
    // Buttons for Customer List Screen
    @FXML
    private Button homeButton;
    @FXML
    private Button orderListButton;
    @FXML
    private Button inventoryButton;
    @FXML
    private Button logoutButton;
    @FXML
    private Button newCustomerButton;

    // Table for Customer List Screen
    @FXML
    private TableColumn<Customer, String> nameColumn;
    @FXML
    private TableColumn<Customer, String> pointOfContactColumn;
    @FXML
    private TableView<Customer> customerTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        pointOfContactColumn.setCellValueFactory(new PropertyValueFactory<>("pointOfContact"));

        try {
            List<Customer> customers = CustomerJSONHelper.readCustomers();
            if (customers == null || customers.isEmpty()) {
                System.out.println("No customers found or error in reading JSON.");
            } else {
                customerTable.getItems().setAll(customers);
                System.out.println("Customers loaded successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Button actions
        homeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Controller.changeScene(event, "dashboard-screen.fxml");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        orderListButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Controller.changeScene(event, "order-list-screen.fxml");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        inventoryButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Controller.changeScene(event, "inventory-screen.fxml");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        logoutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Controller.changeScene(event, "login-screen.fxml");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        newCustomerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Controller.changeScene(event, "add-new-customer-screen.fxml");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}