package atividade2_musica;

public class Cerveja {
    private String marca;
    private int quantidade;
    private double temperatura;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void beber() {
        if (quantidade > 0) {
            quantidade -= 1;
            System.out.println("Você bebeu um gole da " + marca + ". Restam " + quantidade + "ml.");
        } else {
            System.out.println("A cerveja acabou!");
        }
    }

}
