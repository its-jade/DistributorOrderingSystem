package com.example.distributororderingsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.w3c.dom.Text;

public class AddNewCustomerController {

    ObservableList<String> paymentMethodList = FXCollections.observableArrayList("Cash","Credit Card","Check","Wire Transfer", "Other");

    // buttons
    @FXML
    private Button homeButton;
    @FXML
    private Button saveButton;
    @FXML
    private Button submitButton;
    @FXML
    private Button cancelButton;

    // text fields
    @FXML
    private TextField nameField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField cityField;
    @FXML
    private TextField stateField;
    @FXML
    private TextField zipField;
    @FXML
    private TextField phoneField;
    @FXML
    private TextField beerField;
    @FXML
    private TextField pocField;

    // text areas
    @FXML
    private TextArea loadingTextArea;
    @FXML
    private TextArea delieveryTextArea;

    // payment method
    @FXML
    private ComboBox paymentMethodBox;

    @FXML
    private void initialize() {
        paymentMethodBox.setValue("Select One");
        paymentMethodBox.setItems(paymentMethodList);
    }
}
