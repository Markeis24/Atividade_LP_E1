package Atividade3;

public class Retrato {

    private String materialBase;
    private String rosto;
    private int contraste;

    // Construtor vazio
    public Retrato() {}

    // Construtor completo
    public Retrato(String materialBase, String rosto, int contraste) {
        this.materialBase = materialBase;
        this.rosto = rosto;
        this.contraste = contraste;
    }

    // Getters e Setters
    public String getMaterialBase() { return materialBase; }
    public void setMaterialBase(String materialBase) { this.materialBase = materialBase; }

    public String getRosto() { return rosto; }
    public void setRosto(String rosto) { this.rosto = rosto; }

    public int getContraste() { return contraste; }
    public void setContraste(int contraste) { this.contraste = contraste; }

    @Override
    public String toString() {
        return "Retrato{" +
                "materialBase='" + materialBase + '\'' +
                ", rosto='" + rosto + '\'' +
                ", contraste=" + contraste +
                '}';
    }
}
