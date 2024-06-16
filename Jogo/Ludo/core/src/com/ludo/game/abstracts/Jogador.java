package com.ludo.game.abstracts;

import com.ludo.game.entities.Peao;
import com.ludo.game.entities.Dados;
import com.ludo.game.enums.Cor;

 public abstract class Jogador {
	protected Peao[] peoes;
	protected Cor cor;
	protected int CasaInicial;

	abstract int lancaDado(Dados dado);

	abstract int selecionaPeao();

	public Peao[] getPeoes() {
		return this.peoes;
	}

	protected void movePeao(Peao peao, int qtdCasas, Dados dado) {
		int passos = this.lancaDado(dado);
		int peaoIdx = selecionaPeao();
		// peoes[peaoIdx]
	}
}