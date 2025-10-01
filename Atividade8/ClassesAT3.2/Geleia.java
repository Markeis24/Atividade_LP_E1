package atividade3_VikMuniz_Mona;

public class Geleia {
    private String sabor;
    private String cor;
    private String consistencia;

    public Geleia(String sabor, String cor, String consistencia) {
        this.sabor = sabor;
        this.cor = cor;
        this.consistencia = consistencia;
    }

    public void espalhar() {
        System.out.println("A geleia se espalha e cria a textura da Mona Lisa.");
    }
}
