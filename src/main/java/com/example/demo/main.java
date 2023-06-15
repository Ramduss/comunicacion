package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {
    public static Stage currentStage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("select.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 609, 400);
        stage.setTitle("BAKERY!");
        stage.setScene(scene);
        stage.show();
    }
    public void cerrarVentana(Stage stage){
        stage.close();
    }

    public static void main(String[] args) {
        launch();
    }
}