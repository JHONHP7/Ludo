package com.ludo.game.entities;

import java.util.HashMap;
import com.ludo.game.abstracts.CasaAbstrata;

public class Tabuleiro {
    private final HashMap<Integer, CasaAbstrata> casas = new HashMap<>();

    // Adiciona uma casa ao tabuleiro
    public void addCasa(int posicao, CasaAbstrata casa) {
        if (casas.size() < 80) {
            casas.put(posicao, casa);
        }
    }

    // Outros métodos do tabuleiro conforme necessário
}
