package com.ludo.game.entities;

import java.util.ArrayList;
import java.util.HashMap;
import com.ludo.game.abstracts.CasaAbstrata;
import com.ludo.game.abstracts.Jogador;

public class Tabuleiro {
    private final HashMap<Integer, CasaAbstrata> casas = new HashMap<>();
    private final ArrayList<Jogador> jogadores = new ArrayList<>();



    // Adiciona uma casa ao tabuleiro
    public void addCasa(int posicao, CasaAbstrata casa) {
        if (casas.size() < 80) {
            casas.put(posicao, casa);
        }
    }

    public void addJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    // Outros métodos do tabuleiro conforme necessário
}
