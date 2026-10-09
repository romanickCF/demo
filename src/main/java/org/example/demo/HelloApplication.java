package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Button button = new Button("Hello World");

    stage.setWidth(300);
    stage.setHeight(200);
    stage.setTitle("Hello World");
    stage.setResizable(false);
    stage.show();

    Scene scene = new Scene(button,300,300);
    stage.setScene(scene);


    }
}
