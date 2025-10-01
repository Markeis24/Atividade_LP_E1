package atividade2_musica;

public class Confusao {
    private String briga;
    private String motivo;
    private String lugar;

    public String getBriga() {
        return briga;
    }
    public void setBriga(String briga) {
        this.briga = briga;
    }

    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void comecar() {
        System.out.println("Começou uma confusão por " + motivo + " no(a) " + lugar + "! Briga: " + briga);
    }
}
