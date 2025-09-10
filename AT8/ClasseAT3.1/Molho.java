package atividade3_VikMuniz_Che;

public class Molho {
    private String cor;
    private String sabor;
    private double densidade;

    public Molho(String cor, String sabor, double densidade) {
        this.cor = cor;
        this.sabor = sabor;
        this.densidade = densidade;
    }

    public void espalhar() {
        System.out.println("O molho se espalhou formando a base da arte.");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getDensidade() {
        return densidade;
    }

    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }
}
