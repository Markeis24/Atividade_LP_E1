package Atividade3;

public class Feijao {

    private String tipo;
    private String textura;
    private int quantidade;

    // Construtor vazio
    public Feijao() {}

    // Construtor completo
    public Feijao(String tipo, String textura, int quantidade) {
        this.tipo = tipo;
        this.textura = textura;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getTextura() { return textura; }
    public void setTextura(String textura) { this.textura = textura; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    @Override
    public String toString() {
        return "Feijao{" +
                "tipo='" + tipo + '\'' +
                ", textura='" + textura + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}