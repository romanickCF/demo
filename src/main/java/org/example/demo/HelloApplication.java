package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Button button = new Button("Hello World");
        Label label = new Label("Hello World");
        TextField textField = new TextField();

    stage.setWidth(300);
    stage.setHeight(200);
    stage.setTitle("Hello World");
    stage.setResizable(false);

        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(textField);
        vbox.getChildren().addAll(button);
        vbox.getChildren().addAll(label);

    BorderPane root = new BorderPane();
    root.setCenter(vbox);

    Scene scene = new Scene(root ,300,300);
    stage.setScene(scene);
    stage.show();

    button.setOnAction(ActionEvent ->{
        label.setText("Hola a 2DAM Grupo 1");
    });



    }
}
