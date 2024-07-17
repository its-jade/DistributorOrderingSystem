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

public class NewOrderController implements Initializable {

    // buttons
    @FXML
    private Button homeButton;
    @FXML
    private Button saveButton;

    @FXML
    private Button submitButton;
    @FXML
    private Button cancelButton;






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

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)   {
                try {
                    Controller.changeScene(event, "completed-order-screen.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        cancelButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)   {
                try {
                    Controller.changeScene(event, "order-list.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }
}
