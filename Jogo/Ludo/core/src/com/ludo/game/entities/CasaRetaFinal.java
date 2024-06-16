package com.ludo.game.entities;

import com.ludo.game.abstracts.CasaAbstrata;
import com.ludo.game.enums.Cor;
import com.ludo.game.enums.StatusMovimentacao;

public class CasaRetaFinal extends CasaAbstrata {

    public CasaRetaFinal(int idxTabuleiro, Cor cor) {
        super(idxTabuleiro, cor);
    }

    @Override
    public StatusMovimentacao move(int passos, Peao peao, Tabuleiro tabuleiro, boolean ehPrimeiraChamada) {
        // Lidar com possibilidade de haver outro peão aliado no caminho
        if (passos == 0) {
            this.peoes.add(peao);
            return StatusMovimentacao.SUCESSO;
        }

        StatusMovimentacao resultado = vizinhos.get(0).move(passos - 1, peao, tabuleiro, ehPrimeiraChamada);

        // Verifica se é a primeira chamada e se o movimento foi bem sucedido
        if (ehPrimeiraChamada && resultado == StatusMovimentacao.SUCESSO) {
            this.peoes.remove(peao);
        }

        return resultado;
    }

    @Override
    public boolean verificaPeao() {
        return peoes.isEmpty();
    }
}
