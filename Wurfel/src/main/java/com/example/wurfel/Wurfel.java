package com.example.wurfel;

import java.util.Random;

public class Wurfel

{
    int aktuellerWurf;
    private int letzerWurf;

    public int werfen() {
        letzerWurf = aktuellerWurf;
        aktuellerWurf = (int)((Math.random()) * 6 + 1);
        return  aktuellerWurf;
    }

    public int getLetzerWurf() {
        return letzerWurf;
    }

}
