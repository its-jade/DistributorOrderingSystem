package com.example.distributororderingsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    Stage window;
    Scene login, home, addNewCustomer, customerList, completedOrder, newOrder;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;

        Parent root = FXMLLoader.load(getClass().getResource("login-screen.fxml"));
        Scene scene = new Scene(root);
        window.setTitle("Acme Distributing");
        window.setScene(scene);
        window.show();
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login-screen.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 1600, 2560);
//        window.setTitle("Acme Distributing");
//        window.setScene(login);
//        window.show();
    }

    public static void main(String[] args) {
        launch();
    }
}