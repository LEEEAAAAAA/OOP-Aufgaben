package com.example.wurfel;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class WurfelController {
    Wurfel w = new Wurfel();
    @FXML
     TextField Rollingdice;
    @FXML
     TextField LetzterWurf;
    @FXML
    protected void Roll() {
        String wurf = String.valueOf(w.werfen());
        String ausgabe = String.valueOf(w.getLetzerWurf());
        Rollingdice.setText(wurf);
        LetzterWurf.setText(ausgabe);
    }
}