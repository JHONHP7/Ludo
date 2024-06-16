package com.ludo.game.abstracts;

import com.ludo.game.entities.Peao;
import com.ludo.game.entities.Tabuleiro;
import com.ludo.game.enums.Cor;
import com.ludo.game.enums.StatusMovimentacao;

import java.util.ArrayList;
import java.util.List;

public abstract class CasaAbstrata {
	protected StatusMovimentacao statusMovimento;
	protected int idxTabuleiro;
	protected Cor cor;
	protected List<CasaAbstrata> vizinhos = new ArrayList<>();
	protected List<Peao> peoes = new ArrayList<>();

	public CasaAbstrata(int idxTabuleiro, Cor cor) {
		this.idxTabuleiro = idxTabuleiro;
		this.cor = cor;
	}

	public void addVizinho(CasaAbstrata vizinho) {
		vizinhos.add(vizinho);
	}

	/*
	 * TODO: Determinar modo de executar código de remoção de peão após chamadas
	 * recursivas retornarem sucesso da movimentação (adicionar parâmetro que indica
	 * se é primeira chamada?) Determinar se devolução de um Peão comida para o
	 * início será método da casa onde ele estava ou do próprio Peão
	 * (CasaAbstrata.devolveAoInicio(Peao peao, Tabuleiro tabuleiro) ou
	 * Peao.retornaAoInicio(Tabuleiro tabuleiro) ?)
	 */
	public abstract StatusMovimentacao move(int passos, Peao peao, Tabuleiro tabuleiro, boolean ehPrimeiraChamada);

	public abstract boolean verificaPeao();

}
