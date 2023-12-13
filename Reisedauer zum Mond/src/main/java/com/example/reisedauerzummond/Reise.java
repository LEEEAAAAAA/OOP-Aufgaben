package com.example.reisedauerzummond;

public class Reise {

double reisedauerStunden;
double reisedauerTagen;
double Geschwindigkeit;
double Strecke = 384400;

    public void setReisedauer(double Reisedauer) {
        this.reisedauerStunden = Reisedauer;
    }
    public void setGeschwindigkeit(double Geschwindigkeit) {
        this.Geschwindigkeit = Geschwindigkeit;
    }
    public double berechneReisedauerTage(){
        reisedauerStunden = Strecke / Geschwindigkeit;
        reisedauerTagen = reisedauerStunden / 24;
        return reisedauerTagen;
    }
    public double berechneReisedauer(){
        reisedauerStunden = Strecke / Geschwindigkeit;
        return reisedauerStunden;
    }
}
