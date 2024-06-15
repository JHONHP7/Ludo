package Classes_Ludo;

import Enums.Cor;

public class CasaRetaFinal extends CasaAbstrata {
    public CasaRetaFinal(int idxTabuleiro, Cor cor) { super(idxTabuleiro, cor); }

    @Override
    StatusMovimento move(int passos, Peao peao, Tabuleiro tabuleiro, boolean ehPrimeiraChamada) {
        // TODO: lidar com possibilidade de haver outro peão aliado no caminho
        if (passos == 0) {
            this.peoes.add(peao);
            return StatusMovimento.SUCESSO;
        }
        resultado = vizinhos.get(0).move(passos - 1, peao, tabuleiro);
        if (ehPrimeiraChamada && resultado == StatusMovimento.SUCESSO) {
            this.peoes.remove(peao);
        }
        return resultado;
    }
}
