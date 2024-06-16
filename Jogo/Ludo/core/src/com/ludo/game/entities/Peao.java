package com.ludo.game.entities;

import com.ludo.game.abstracts.Jogador;

public class Peao {
    int idxCasaPeao;
    int id;

    Jogador jogadorDono;

    public Peao(int idxCasaPeao, int id, Jogador jogadorDono) {
        this.idxCasaPeao = idxCasaPeao;
        this.id = id;
        this.jogadorDono = jogadorDono;
    }
}
