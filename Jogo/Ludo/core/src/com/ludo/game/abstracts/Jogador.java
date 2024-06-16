package com.ludo.game.abstracts;

import com.ludo.game.entities.Peao;
import com.ludo.game.entities.Dado;
import com.ludo.game.enums.Cor;

 public abstract class Jogador {
	protected Peao[] peoes;
	protected Cor cor;
	protected int CasaInicial;

	protected abstract int lancaDado(Dado dado);

	protected abstract int selecionaPeao();

	public Peao[] getPeoes() {
		return this.peoes;
	}

	protected void movePeao(Peao peao, int qtdCasas, Dado dado) {
		int passos = this.lancaDado(dado);
		int peaoIdx = selecionaPeao();
		// peoes[peaoIdx]
	}
}