package com.example.tannenbaum;

public class Tannenbaum {
    private int stammbreite;
    private int stammhoehe;
    private int kronenhoehe;
    private String zeichnung;

    public void setStammbreite(int breite){
        this.stammbreite = breite;
    }

    public void setStammhoehe(int hoehe){
        this.stammhoehe = hoehe;
    }

    public void setKronenhoehe(int kronenhoehe){
        this.kronenhoehe = kronenhoehe;
    }

    public void baumZeichnen(){
        StringBuilder baumBauen = new StringBuilder();
        for (int i = 1; i <= kronenhoehe; i++) {
            for (int j = 1; j <= ((kronenhoehe + kronenhoehe - 1) - (i + i - 1)) / 2; j++) {
                baumBauen.append(" ");
            }
            for (int k = 1; k <= i + (i - 1); k++) {
                baumBauen.append("*");
            }
            baumBauen.append("\n");
        }

        for (int i = 1; i <= stammhoehe; i++) {
            for (int j = 1; j <= (kronenhoehe + kronenhoehe - 1 - stammbreite) /2; j++) {
                baumBauen.append(" ");
            }
            for (int k = 1; k <= stammbreite; k++) {
                baumBauen.append("#");
            }
            baumBauen.append("\n");
        }
        zeichnung = baumBauen.toString();
    }

    public String getZeichnung(){
        return zeichnung;
    }
}
