package atividade5_video;

public class Telefone {
    private String cor;
    private String tipo;
    private boolean conectado;

    public Telefone(String cor, String tipo, boolean conectado) {
        this.cor = cor;
        this.tipo = tipo;
        this.conectado = conectado;
    }

    public void tocar() {
        if (conectado) {
            System.out.println("O telefone " + tipo + " está tocando.");
        } else {
            System.out.println("Telefone desconectado.");
        }
    }

    public void desligar() {
        conectado = false;
        System.out.println("Telefone desligado.");
    }

    public void receberChamada() {
        if (conectado) {
            System.out.println("Recebendo chamada no telefone " + tipo + ".");
        } else {
            System.out.println("Não é possível receber chamadas.");
        }
    }
}
