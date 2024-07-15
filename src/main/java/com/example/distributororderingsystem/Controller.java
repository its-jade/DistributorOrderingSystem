package com.example.distributororderingsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Controller {

    private Stage window;
    private Scene scene;
    private Parent root;

    public void switchToHome(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("home-screen.fxml"));
        window = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    public void switchToCustomerList(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("customer-list.fxml"));
        window = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    public void switchToAddNewCustomer(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("add-new-customer.fxml"));
        window = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    public void switchToNewOrder(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("new-order.fxml"));
        window = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    public void switchToCompleteOrder(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("competed-order-screen.fxml"));
        window = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}