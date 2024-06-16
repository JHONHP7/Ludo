package com.ludo.game.entities;

import com.ludo.game.abstracts.Jogador;

import java.util.Scanner;

public class JogadorHumano extends Jogador {

    Scanner scanner = new Scanner(System.in);


    @Override
    protected int lancaDado(Dado dado) {
        return 0;
    }

    @Override
    protected int selecionaPeao() {
        return 0;
    }
}
