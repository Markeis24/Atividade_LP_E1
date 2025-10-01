package atividade3_VikMuniz_Che;

public class Retrato {
    private String rosto;
    private double contraste;
    private String materialBase;

    public Retrato(String rosto, double contraste, String materialBase) {
        this.rosto = rosto;
        this.contraste = contraste;
        this.materialBase = materialBase;
    }

    public void exibir() {
        System.out.println("O retrato artístico aparece através do feijão e do molho.");
    }

    public String getRosto() {
        return rosto;
    }

    public void setRosto(String rosto) {
        this.rosto = rosto;
    }

    public double getContraste() {
        return contraste;
    }

    public void setContraste(double contraste) {
        this.contraste = contraste;
    }

    public String getMaterialBase() {
        return materialBase;
    }

    public void setMaterialBase(String materialBase) {
        this.materialBase = materialBase;
    }
}
