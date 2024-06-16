package com.ludo.game.entities;

public class Dado {
    private int valor;

    public int lancaDado() { 
        valor = (int) ((Math.random() * (6 - 1) + 1));
        return valor;
    }
}
