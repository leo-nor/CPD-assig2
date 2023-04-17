package com.example.cpdassign2.user;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AuthenticationMenu extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Create UI controls
        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Login");
        Button registerButton = new Button("Register");

        // Create layout panes and add controls
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10));
        root.setHgap(10);
        root.setVgap(10);
        root.add(usernameLabel, 0, 0);
        root.add(usernameField, 1, 0);
        root.add(passwordLabel, 0, 1);
        root.add(passwordField, 1, 1);

        HBox buttonBox = new HBox();
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(10);
        buttonBox.getChildren().addAll(loginButton, registerButton);
        root.add(buttonBox, 0, 2, 2, 1);

        // Create scene and add layout pane
        Scene scene = new Scene(root, 300, 200);

        // Set stage properties and show
        primaryStage.setScene(scene);
        primaryStage.setTitle("Authentication Menu");
        primaryStage.show();
    }

    public static boolean initializeAuth() {
        launch();
        return true;
    }
}