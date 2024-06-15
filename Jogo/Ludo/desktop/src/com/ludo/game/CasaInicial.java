package Classes_Ludo;

import Enums.Cor;

public class CasaInicial extends CasaAbstrata {
    public CasaInicial(int idxTabuleiro, Cor cor, Peao p1, Peao p2, Peao p3, Peao p4) {
        super(idxTabuleiro, cor);
        this.peoes.add(p1);
        this.peoes.add(p2);
        this.peoes.add(p3);
        this.peoes.add(p4);
    }

    @Override
    StatusMovimento move(int passos, Peao peao, Tabuleiro tabuleiro, boolean ehPrimeiraChamada) {
        if (!verificaPeao() || passos != 6) {
            return StatusMovimento.FALHA;
        }
        StatusMovimento resultado = this.vizinhos.get(0).move(0, peao, tabuleiro);
        if (resultado == StatusMovimento.SUCESSO) {
            this.peoes.remove(peao)
        }
    }

    @Override
    boolean verificaPeao() {
        return this.peoes.isEmpty();
    }
}
