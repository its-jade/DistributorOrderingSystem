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

        // takes in the width and height of current window
        double currentWidth = stage.getWidth();
        double currentHeight = stage.getHeight();

        stage.setTitle("Acme Distributing");

        Scene newScene = new Scene(root, currentWidth, currentHeight);

        stage.setScene(newScene);

        stage.show();
    }
}