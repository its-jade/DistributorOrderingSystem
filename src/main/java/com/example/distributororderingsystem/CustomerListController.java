package com.example.distributororderingsystem;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CustomerListController implements Initializable {
    @FXML
    private Button homeButton;
    @FXML
    private Button addNewCustomerButton;

    // methods for button functionality
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        homeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)   {
                try {
                    Controller.changeScene(event, "home-screen.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        addNewCustomerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)   {
                try {
                    Controller.changeScene(event, "add-new-customer.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }
}
