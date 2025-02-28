package com.example.distributororderingsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class OrderListController implements Initializable {
    @FXML
    private Button homeButton;
    @FXML
    private Button customerListButton;
    @FXML
    private Button inventoryButton;
    @FXML
    private Button logoutButton;
    @FXML
    private Button newOrderButton;

    // methods for button functionality
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        homeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Controller.changeScene(event, "dashboard-screen.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

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

    }
}
