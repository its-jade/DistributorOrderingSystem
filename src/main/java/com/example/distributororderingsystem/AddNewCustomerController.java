package com.example.distributororderingsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AddNewCustomerController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
