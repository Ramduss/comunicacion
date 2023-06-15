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

public class capaPpal {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image;

    @FXML
    void initialize() {
        assert image != null : "fx:id=\"image\" was not injected: check your FXML file 'capaPpal.fxml'.";
    }
    Stage capaBlandito = new Stage();

    public void capacitarBlandito(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("capaBlandito.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 609, 400);
        capaBlandito.setTitle("Blandito!");
        capaBlandito.setScene(scene);
        capaBlandito.show();
    }

    public void capacitarSalvado(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("capaSalvado.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 609, 400);
        capaBlandito.setTitle("Salvado!");
        capaBlandito.setScene(scene);
        capaBlandito.show();

    }

    public void capacitarCroissant(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("capaCroissant.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 609, 400);
        capaBlandito.setTitle("Croissant!");
        capaBlandito.setScene(scene);
        capaBlandito.show();
    }

    public void capacitarMantecada(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("capaMantecada.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 609, 400);
        capaBlandito.setTitle("Mantecada!");
        capaBlandito.setScene(scene);
        capaBlandito.show();
    }
}
