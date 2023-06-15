package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class SelectController {

    public Button botonCapacitacion;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image;

    @FXML
    void initialize() {
        assert image != null : "fx:id=\"image\" was not injected: check your FXML file 'select.fxml'.";
    }

    Stage capaPpal = new Stage();
    Stage evalPpal = new Stage();
    public void entrarCapacitacion(ActionEvent actionEvent) throws RuntimeException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("capaPpal.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 609, 400);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        capaPpal.setTitle("CAPACITACION!");
        capaPpal.setScene(scene);
        capaPpal.show();


    }

    public void entrarEvaluacion(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("evalPpal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 609, 400);
        evalPpal.setTitle("EVALUACION!");
        evalPpal.setScene(scene);
        evalPpal.show();

    }
}
