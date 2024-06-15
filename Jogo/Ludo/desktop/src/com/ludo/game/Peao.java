package Classes_Ludo;

import Enums.Cor;

public class Peao {
    int idxCasaPeao = 0;
    private final int id;
    Cor cor;

    private final Jogador jogadorDono;

    public Peao(Cor cor, int id, Jogador jogadorDono) {
        this.cor = cor;
        this.id = id;
        this.jogadorDono = jogadorDono;
    }

    public int getId() {
        return id;
    }

    public Jogador getJogador() {
        return jogadorDono;
    }

    @Override
    public String toString() {
        return "Peão (pos: " + Integer.toString(this.idxCasaPeao) + ")";
    }
}
