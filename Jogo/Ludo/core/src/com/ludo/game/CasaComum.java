package Classes_Ludo;
import Enums.Cor;

import java.util.List;
public class CasaComum extends CasaAbstrata {

    int idJogadorVermelho;
    int idJogadorAzul;
    int idJogadorVerde;
    int idJogadorAmarelo;

    public CasaComum(int idxTabuleiro) {
        super(idxTabuleiro, Cor.BRANCO);
    }
}
