package Classes_Ludo;
import java.util.Scanner;
public class JogadorHumano extends Jogador {
    Scanner scanner = new Scanner(System.in);

    @Override
    public int lancaDado(Dado dado) {
        System.out.println("Digite qualquer tecla para lançar o dado");
        scanner.nextLine();
        int resultadoDado;
        int qtdRepeticoesSeis = 0;
        do {
            resultadoDado = dado.lancaDado();
            if (resultadoDado == 6) {
                qtdRepeticoesSeis += 1;

                // Printa opções de peão para mover
                System.out.print("Selecione o peão para mover: ");
                int peaoIdx = 0;
                for (int i = 0; i < peoes.length; i++) {
                    System.out.print("[" + i + "] " + peoes[i].toString());
                    if (i == (peoes.length - 1)) {
                        System.out.println();
                    }
                    else {
                        System.out.print("   ");
                    }
                }

                peaoIdx = scanner.nextInt();
                this.movePeao(peoes[peaoIdx], resultadoDado);

                System.out.println("Deseja lançar novamente? [S / N]");
                if (scanner.nextLine().equalsIgnoreCase("n")) {
                    break;
                }
            }
        } while (qtdRepeticoesSeis < 3 && resultadoDado == 6);
        return dado.lancaDado();
    }
}
