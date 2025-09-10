package atividade4_imagemDoodle;

public class Evento {
    private String nome;
    private String local;
    private int publicoEstimado;

    public Evento(String nome, String local, int publicoEstimado) {
        this.nome = nome;
        this.local = local;
        this.publicoEstimado = publicoEstimado;
    }

    public void iniciar() {
        System.out.println("O evento " + nome + " começou no " + local + ".");
    }

    public void encerrar() {
        System.out.println("O evento " + nome + " terminou.");
    }

    public void divulgar() {
        System.out.println("O evento " + nome + " está sendo divulgado.");
    }
}
