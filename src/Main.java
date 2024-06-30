import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Bruna");
        Jogador j2 = new Jogador("Jogador Dois");
        Jogo jogo = new Jogo(j1,j2);

        while (!jogo.alguemGanhou()){
            Usuario.mensagemEmbaralhando();
            jogo.baralho.embaralhar();
            jogo.distribuirCartas();
            while(!jogo.alguemPontuou()) {
                jogo.iniciarRodada();
            }
            Usuario.exibirPlacar(j1.nome, jogo.pontuacaoA, j2.nome, jogo.pontuacaoB);
        }
    }
}