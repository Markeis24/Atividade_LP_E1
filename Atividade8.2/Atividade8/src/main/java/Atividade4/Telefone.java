package Atividade4;

// Classe Telefone
public class Telefone {
    private String tipo;
    private String cor;
    private boolean conectado;

    public Telefone(String tipo, String cor, boolean conectado) {
        this.tipo = tipo;
        this.cor = cor;
        this.conectado = conectado;
    }

    public String getTipo() { return tipo; }
    public String getCor() { return cor; }
    public boolean isConectado() { return conectado; }
}