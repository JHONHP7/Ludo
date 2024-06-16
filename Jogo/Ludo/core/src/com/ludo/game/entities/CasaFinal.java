package com.ludo.game.entities;

import com.ludo.game.abstracts.CasaAbstrata;
import com.ludo.game.enums.Cor;
import com.ludo.game.enums.StatusMovimentacao;

public class CasaFinal extends CasaAbstrata {

    public CasaFinal(int idxTabuleiro, Cor cor) {
        super(idxTabuleiro, cor);
    }

    @Override
    public StatusMovimentacao move(int passos, Peao peao, Tabuleiro tabuleiro, boolean ehPrimeiraChamada) {
        if (passos == 0) {
            return StatusMovimentacao.FALHA;
        } else {
            //TO DO colocar peao
            this.peoes.add(peao);
            return StatusMovimentacao.SUCESSO;
        }
    }

    @Override
    public boolean verificaPeao() {
        return (this.peoes.size() == 4);
    }

    public boolean contemTodosPeoes() {
        return verificaPeao();
    }
}
