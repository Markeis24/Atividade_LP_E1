package Atividade4;

// Classe Personagem
public class Personagem {
    private String nome;
    private String tempoRestante;
    private boolean fuga;

    public Personagem(String nome, String tempoRestante, boolean fuga) {
        this.nome = nome;
        this.tempoRestante = tempoRestante;
        this.fuga = fuga;
    }

    public String getNome() { return nome; }
    public String getTempoRestante() { return tempoRestante; }
    public boolean isFuga() { return fuga; }
}