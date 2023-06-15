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

public class evalPpal {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image;

    @FXML
    void initialize() {
        assert image != null : "fx:id=\"image\" was not injected: check your FXML file 'evalPpal.fxml'.";
    }
    Stage evalIngredientes = new Stage();

    public void evaluarBlandito(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("evalIngredientes.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 609, 400);
        evalIngredientes.setTitle("EVALUACION!");
        evalIngredientes.setScene(scene);
        evalIngredientes.show();
    }

    public void EvaluarSalvado(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("evalIngredientes.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 609, 400);
        evalIngredientes.setTitle("EVALUACION!");
        evalIngredientes.setScene(scene);
        evalIngredientes.show();
    }

    public void evaluarCroissant(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("evalIngredientes.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 609, 400);
        evalIngredientes.setTitle("EVALUACION!");
        evalIngredientes.setScene(scene);
        evalIngredientes.show();

    }

    public void evaluarMantecada(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("evalIngredientes.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 609, 400);
        evalIngredientes.setTitle("EVALUACION!");
        evalIngredientes.setScene(scene);
        evalIngredientes.show();
    }
}
