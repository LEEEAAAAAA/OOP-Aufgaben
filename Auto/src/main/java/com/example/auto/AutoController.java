package com.example.auto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class AutoController {
    @FXML
    private Label FSShower;

    @FXML
    private ComboBox carChoiceCB;

    @FXML

    public void initialize(){
        ObservableList<Auto> autos = FXCollections.observableArrayList();
        autos.add(new Auto("Porsche", 250));
        autos.add(new Auto("Opel", 90));
        autos.add(new Auto("Ferrari", 370));

        carChoiceCB.setItems(autos);

    }
    protected void onHelloButtonClick() {
        //comboBoxProducts.getValue();


    }
}