package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class evalIngredientesControler {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image;

    @FXML
    void initialize() {
        assert image != null : "fx:id=\"image\" was not injected: check your FXML file 'evalIngredientes.fxml'.";
    }
    Stage evalProceso = new Stage();

    public void evaluarProceso(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("evalProceso.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 609, 400);
        evalProceso.setTitle("EVALUACION!");
        evalProceso.setScene(scene);
        evalProceso.show();
    }
}
