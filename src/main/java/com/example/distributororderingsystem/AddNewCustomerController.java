package com.example.distributororderingsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.w3c.dom.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddNewCustomerController implements Initializable {

    ObservableList<String> paymentMethodList = FXCollections.observableArrayList("Cash","EBT","Fintech");

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


    // methods for button functionality
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        paymentMethodBox.setValue("Select One");
        paymentMethodBox.setItems(paymentMethodList);

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

        cancelButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)   {
                try {
                    Controller.changeScene(event, "customer-list.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }
}
