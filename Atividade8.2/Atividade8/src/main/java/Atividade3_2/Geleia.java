package Atividade3_2;

public class Geleia {
    private String cor;
    private String consistencia;
    private String sabor;

    public Geleia() {}

    public Geleia(String cor, String consistencia, String sabor) {
        this.cor = cor;
        this.consistencia = consistencia;
        this.sabor = sabor;
    }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getConsistencia() { return consistencia; }
    public void setConsistencia(String consistencia) { this.consistencia = consistencia; }

    public String getSabor() { return sabor; }
    public void setSabor(String sabor) { this.sabor = sabor; }

    @Override
    public String toString() {
        return "Geleia{" +
                "cor='" + cor + '\'' +
                ", consistencia='" + consistencia + '\'' +
                ", sabor='" + sabor + '\'' +
                '}';
    }
}