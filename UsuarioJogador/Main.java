package jogo;

public class Main {
    public static void main(String[] args) {

        UsuarioJogo jogador1 = new UsuarioJogo("Jogador 1", "Vader");
        UsuarioJogo jogador2 = new UsuarioJogo("Jogador 2", "Darth");

        jogador1.aumentarPontuacao();
        jogador1.subirNivel();

        jogador1.aumentarPontuacao();
        jogador1.aumentarPontuacao();

        jogador2.aumentarPontuacao();
        jogador2.subirNivel();
        jogador2.subirNivel();
        jogador2.bonus();

        System.out.println("A pontuação do jogador 1 é: " + jogador1.pontuacaoAtual() + ", e seu nível é: " + jogador1.nivelAtual());
        System.out.println("A pontuação do jogador 2 é: " + jogador2.pontuacaoAtual() + ", e seu nível é: " + jogador2.nivelAtual());

    }
}
