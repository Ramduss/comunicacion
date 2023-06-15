package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class capaCroissantControler {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image;

    @FXML
    void initialize() {
        assert image != null : "fx:id=\"image\" was not injected: check your FXML file 'capacroissant.fxml'.";
    }

}
