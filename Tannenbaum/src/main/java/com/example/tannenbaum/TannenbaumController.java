package com.example.tannenbaum;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TannenbaumController {
    private Tannenbaum t = new Tannenbaum();

    @FXML
    private TextArea zeichnungsArea;

    @FXML
    private TextField stammhoeheEingabe;

    @FXML
    private TextField stammbreiteEingabe;

    @FXML
    private TextField kronenhoeheEingabe;

    @FXML
    protected void tannenbaumZeichnen() {
        try {
            int stammbreite = Integer.parseInt(stammbreiteEingabe.getText());
            int stammhoehe = Integer.parseInt(stammhoeheEingabe.getText());
            int kronenhoehe = Integer.parseInt(kronenhoeheEingabe.getText());

            t.setStammbreite(stammbreite);
            t.setStammhoehe(stammhoehe);
            t.setKronenhoehe(kronenhoehe);

            t.baumZeichnen();
            zeichnungsArea.setText(t.getZeichnung());
        } catch (NumberFormatException e) {
            zeichnungsArea.setText("Please enter valid numeric values.");
        }
    }
}
