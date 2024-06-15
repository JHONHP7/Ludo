package Classes_Ludo;

import Enums.Cor;

public class CasaFinal extends CasaAbstrata {
    public CasaFinal(int idxTabuleiro, Cor cor) { super(idxTabuleiro, cor); }

    @Override
    protected move(int passos, Peao peao, Tabuleiro tabuleiro, boolean ehPrimeiraChamada) {
        if (passos > 0) {
            return StatusMovimento.FALHA;
        }
        else {
            // TODO colocar peão
            this.peoes.add(peao);
            return StatusMovimento.SUCESSO;
        }
    }

    @Override
    boolean verificaPeao() {
        return (this.peoes.size() == 4);
    }

    public boolean contemTodosPeoes() {
        return verificaPeao();
    }
}
