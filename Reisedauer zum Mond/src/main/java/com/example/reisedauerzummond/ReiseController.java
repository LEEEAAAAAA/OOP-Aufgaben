package com.example.reisedauerzummond;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ReiseController {

    Reise reise = new Reise();
    @FXML
    private TextField GeschwindigkeitTextFeld;
    private TextField AusgabeReisedauerTextFeld;

    @FXML
    protected void setztReisedauer() {
        double Geschwindigkeit = Double.parseDouble(GeschwindigkeitTextFeld.getText());

        reise.setGeschwindigkeit(Geschwindigkeit);


    }

    @FXML
    protected void berechnungMitTag(){
        String ausgabeReisedauer = String.valueOf(reise.berechneReisedauer());

        AusgabeReisedauerTextFeld.setText(ausgabeReisedauer);
    }
}