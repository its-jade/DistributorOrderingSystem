package com.example.distributororderingsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {

    @FXML
    private TextField userNameField;
    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;


    // methods for button functionality
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Controller.changeScene(event, "dashboard-screen.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }

    private boolean validateCredentials(String username, String password) {
        if (username.equals("salesrep1") && password.equals("password1")) {
            return true;
        } else if (username.equals("salesrep2") && password.equals("password2")) {
            return true;
        } else if (username.equals("salesrep3") && password.equals("password3")) {
            return true;
        }
        return false;
    }
    @FXML
    private void handleLogin() {
        String username = userNameField.getText();
        String password = passwordField.getText();

        if (validateCredentials(username, password)) {
            // Successful login, you can navigate to another screen or perform actions
            showInformationDialog("Login Successful", "Welcome, " + username + "!");
            // Here you can navigate to another screen or perform further actions
            // Example: loadMainScreen();
        } else {
            // Failed login attempt
            showWarningDialog("Login Failed", "Invalid username or password.");
            // Clear fields for retry
            userNameField.clear();
            passwordField.clear();
        }
    }

    private void showInformationDialog(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void showWarningDialog(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}

