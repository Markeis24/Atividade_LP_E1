package atividade5_video;

public class Acougueiro {
    private final String nome;
    private final boolean cortando;
    private final String tipoCarne;

    public Acougueiro(String nome, boolean cortando, String tipoCarne) {
        this.nome = nome;
        this.cortando = cortando;
        this.tipoCarne = tipoCarne;
    }

    public void cortar() {
        if (cortando) {
            System.out.println(nome + " está cortando " + tipoCarne + ".");
        } else {
            System.out.println(nome + " não está cortando carne.");
        }
    }

    public void entregar() {
        System.out.println(nome + " entregou " + tipoCarne + ".");
    }

    public void afirmar() {
        System.out.println(nome + " diz: Essa carne é de qualidade!");
    }
}
