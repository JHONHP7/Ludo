package com.ludo.game.entities;

import com.ludo.game.abstracts.CasaAbstrata;
import com.ludo.game.entities.Peao;
import com.ludo.game.entities.Tabuleiro;
import com.ludo.game.enums.Cor;
import com.ludo.game.enums.StatusMovimentacao;

import java.util.List;

public class CasaComum extends CasaAbstrata {

	private int idJogadorVermelho;
	private int idJogadorAzul;
	private int idJogadorVerde;
	private int idJogadorAmarelo;

	public CasaComum(int idxTabuleiro) {
		super(idxTabuleiro, Cor.BRANCO);
	}

	@Override
	public boolean verificaPeao() {
		// Implementação da verificação específica da CasaComum
		return true;
	}

	@Override
	public StatusMovimentacao move(int passos, Peao peao, Tabuleiro tabuleiro, boolean ehPrimeiraChamada) {
		return StatusMovimentacao.FALHA;
	};
}
