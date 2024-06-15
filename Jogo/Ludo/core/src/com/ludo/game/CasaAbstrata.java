package Classes_Ludo;
package Enums;

import Enums.Cor;

import java.util.List;

abstract public class CasaAbstrata {

    protected enum StatusMovimento {
        SUCESSO,
        FALHA
    }

    protected int idxTabuleiro;
    protected Cor cor;
    protected List<CasaAbstrata> vizinhos;
    List<Peao> peoes;

    public CasaAbstrata(int idxTabuleiro, Cor cor) {
        this.idxTabuleiro = idxTabuleiro;
        this.cor = cor;
    }

    public addVizinho(CasaAbstrata vizinho) {
        vizinhos.add(vizinho);
    }

    /* TODO:
    * Determinar modo de executar código de remoção de peão após chamadas recursivas retornarem sucesso da movimentação
    (adicionar parâmetro que indica se é primeira chamada?)
    * Determinar se devolução de um Peão comida para o início será método da casa onde ele estava ou do próprio Peão
    (CasaAbstrata.devolveAoInicio(Peao peao, Tabuleiro tabuleiro) ou Peao.retornaAoInicio(Tabuleiro tabuleiro) ?)
    */
    abstract StatusMovimento move(int passos, Peao peao, Tabuleiro tabuleiro, boolean ehPrimeiraChamada);
    abstract boolean verificaPeao();
}
