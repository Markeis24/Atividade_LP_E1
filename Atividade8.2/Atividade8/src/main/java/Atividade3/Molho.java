package Atividade3;

public class Molho {

    private String cor;
    private String sabor;
    private double densidade;

    // Construtor vazio
    public Molho() {}

    // Construtor completo
    public Molho(String cor, String sabor, double densidade) {
        this.cor = cor;
        this.sabor = sabor;
        this.densidade = densidade;
    }

    // Getters e Setters
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getSabor() { return sabor; }
    public void setSabor(String sabor) { this.sabor = sabor; }

    public double getDensidade() { return densidade; }
    public void setDensidade(double densidade) { this.densidade = densidade; }

    @Override
    public String toString() {
        return "Molho{" +
                "cor='" + cor + '\'' +
                ", sabor='" + sabor + '\'' +
                ", densidade=" + densidade +
                '}';
    }
}