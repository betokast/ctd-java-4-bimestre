package jogo;

public class UsuarioJogo {

    private String nome;
    private String nickName;
    private int pontuacao = 0;
    private int nivel;

    //Construtor:
    public UsuarioJogo(String nome, String nickName){
        this.nome = nome;
        this.nickName = nickName;
    }

    public void aumentarPontuacao(){
        this.pontuacao+= 2;
    }

    public void subirNivel(){
        this.nivel += 1;
    }

    public void bonus(){
        this.pontuacao += 1;
    }

    public int pontuacaoAtual(){
        return this.pontuacao;
    }

    public int nivelAtual(){
        return this.nivel;
    }
};

