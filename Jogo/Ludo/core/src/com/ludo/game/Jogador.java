package Classes_Ludo;

import Enums.Cor;

public abstract class Jogador {
    protected Peao[] peoes;
    protected Cor cor;
    protected int CasaInicial;

    abstract int lancaDado(Dado dado);
    abstract int selecionaPeao()


    public Peao[] getPeoes() {
        return this.peoes;
    }

    protected void movePeao(Peao peao, int qtdCasas) {
        int passos = this.lancaDado(dado);
        peaoIdx = selecionaPeao();
        // peoes[peaoIdx].
    }
}
