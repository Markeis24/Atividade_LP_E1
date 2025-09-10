package atividade2_musica;

public class Vaga {
    private String dono;
    private String carro;
    private String ameaca;

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getCarro() {
        return carro;
    }
    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getAmeaca() {
        return ameaca;
    }
    public void setAmeaca(String ameaca) {
        this.ameaca = ameaca;
    }

    public void verificar() {
        if (dono != null && carro != null) {
            System.out.println("O carro " + carro + " do dono " + dono + " está na vaga. Atenção: " + ameaca);
        } else {
            System.out.println("A vaga está livre.");
        }
    }
}
