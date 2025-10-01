package atividade3_VikMuniz_Che;

public class Feijao {
    private String tipo;
    private int quantidade;
    private String textura;

    public Feijao(String tipo, int quantidade, String textura) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.textura = textura;
    }

    public void cozinhar() {
        System.out.println("O feijão foi cozido até a textura desejada.");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }
}
