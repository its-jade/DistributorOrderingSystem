package com.example.distributororderingsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CustomerListController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
