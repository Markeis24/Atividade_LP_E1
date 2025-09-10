package atividade4_imagemDoodle;

public class Pessoa {
    private String nome;
    private int idade;
    private String atividade;

    public Pessoa(String nome, int idade, String atividade) {
        this.nome = nome;
        this.idade = idade;
        this.atividade = atividade;
    }

    public void interagir() {
        System.out.println(nome + " está interagindo com outra pessoa.");
    }

    public void praticarEsporte() {
        System.out.println(nome + " está praticando " + atividade + ".");
    }

    public void comer() {
        System.out.println(nome + " está comendo algo do food truck.");
    }
}
