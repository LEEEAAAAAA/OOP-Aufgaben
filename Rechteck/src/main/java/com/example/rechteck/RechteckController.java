package com.example.rechteck;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RechteckController {
    Rechteck rechteck = new Rechteck();

    @FXML
    protected void BerechnenButtonClick() {
        rechteck.getArea();
    }
    
    protected void ExitScene(){
        rechteck.Exit();
    }
}