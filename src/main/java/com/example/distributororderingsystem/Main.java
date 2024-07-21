package com.example.distributororderingsystem;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;

        Parent root = FXMLLoader.load(getClass().getResource("login-screen.fxml"));
        Scene scene = new Scene(root);
        this.stage.setTitle("Acme Distributing");
        this.stage.setScene(scene);
        this.stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}