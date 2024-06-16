package com.ludo.game.entities;

import java.util.Random; 

public class Dados {
    private int valor;

    public int lancaDado() { 
        valor = (int) ((Math.random() * (6 - 1) + 1));
        return valor;
    }
}
