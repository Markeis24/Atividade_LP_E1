package Atividade4;

// Classe Acougueiro
public class Acougueiro {
    private String nome;
    private String tipoCarne;
    private boolean cortando;

    public Acougueiro(String nome, String tipoCarne, boolean cortando) {
        this.nome = nome;
        this.tipoCarne = tipoCarne;
        this.cortando = cortando;
    }

    public String getNome() { return nome; }
    public String getTipoCarne() { return tipoCarne; }
    public boolean isCortando() { return cortando; }
}