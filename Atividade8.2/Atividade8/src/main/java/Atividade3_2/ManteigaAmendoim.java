package Atividade3_2;

public class ManteigaAmendoim {
    private String marca;
    private String cremosidade;
    private int quantidade;

    public ManteigaAmendoim() {}

    public ManteigaAmendoim(String marca, String cremosidade, int quantidade) {
        this.marca = marca;
        this.cremosidade = cremosidade;
        this.quantidade = quantidade;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getCremosidade() { return cremosidade; }
    public void setCremosidade(String cremosidade) { this.cremosidade = cremosidade; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    @Override
    public String toString() {
        return "ManteigaAmendoim{" +
                "marca='" + marca + '\'' +
                ", cremosidade='" + cremosidade + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
