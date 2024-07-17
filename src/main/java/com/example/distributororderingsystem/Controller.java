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

    // method for switching to a new scene
    public static void changeScene(javafx.event.ActionEvent event, String fxmlFile) throws IOException{
        Parent root = null;

        root = FXMLLoader.load(Controller.class.getResource(fxmlFile));

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Acme Distributing");
        stage.setScene(new Scene(root, 1920,1200));
        stage.show();
    }
}