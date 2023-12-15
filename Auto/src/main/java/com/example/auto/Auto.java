package com.example.auto;

public class Auto {
private int aktuelleGeschwindigkeit;
private int aktuellerGang;
private boolean istMotorGestartet;
private String marke;
private int ps;
private int TankFuellstand;

    public Auto(String marke, int ps) {

    }

    public int getAktuelleGeschwindigkeit() {
        return aktuelleGeschwindigkeit;
    }

    public void setAktuelleGeschwindigkeit(int aktuelleGeschwindigkeit) {
        this.aktuelleGeschwindigkeit = aktuelleGeschwindigkeit;
    }

    public int getAktuellerGang() {
        return aktuellerGang;
    }

    public void setAktuellerGang(int aktuellerGang) {
        this.aktuellerGang = aktuellerGang;
    }

    public boolean isIstMotorGestartet() {
        return istMotorGestartet;
    }

    public void setIstMotorGestartet(boolean istMotorGestartet) {
        this.istMotorGestartet = istMotorGestartet;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getTankFuellstand() {
        return TankFuellstand;
    }

    public void setTankFuellstand(int tankFuellstand) {
        TankFuellstand = tankFuellstand;
    }
    public void auftranken(){

    }
    public void bremsen(){

    }
    public void gibGas(){

    }
    public void hupe(){

    }
    public void schalteMotorAus(){

    }
    public void starteMotor(){

    }
    public String toString(){
        return "hello";
    }
}
