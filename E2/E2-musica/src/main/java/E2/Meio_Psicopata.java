package E2;

public class Meio_Psicopata {

    private String ameacaVaga;
    private String brigaConfusao;
    private String carroVaga;
    private String donoVaga;
    private String lugarConfusao;
    private String marcaCerveja;
    private String motivoConfusao;
    private int quantidadeCerveja;
    private double temperaturaCerveja;

    // Construtor vazio
    public Meio_Psicopata() {}

    // Construtor com todos os campos
    public Meio_Psicopata(String ameacaVaga, String brigaConfusao, String carroVaga, String donoVaga,
                          String lugarConfusao, String marcaCerveja, String motivoConfusao,
                          int quantidadeCerveja, double temperaturaCerveja) {
        this.ameacaVaga = ameacaVaga;
        this.brigaConfusao = brigaConfusao;
        this.carroVaga = carroVaga;
        this.donoVaga = donoVaga;
        this.lugarConfusao = lugarConfusao;
        this.marcaCerveja = marcaCerveja;
        this.motivoConfusao = motivoConfusao;
        this.quantidadeCerveja = quantidadeCerveja;
        this.temperaturaCerveja = temperaturaCerveja;
    }

    // Getters e Setters
    public String getAmeacaVaga() { return ameacaVaga; }
    public void setAmeacaVaga(String ameacaVaga) { this.ameacaVaga = ameacaVaga; }

    public String getBrigaConfusao() { return brigaConfusao; }
    public void setBrigaConfusao(String brigaConfusao) { this.brigaConfusao = brigaConfusao; }

    public String getCarroVaga() { return carroVaga; }
    public void setCarroVaga(String carroVaga) { this.carroVaga = carroVaga; }

    public String getDonoVaga() { return donoVaga; }
    public void setDonoVaga(String donoVaga) { this.donoVaga = donoVaga; }

    public String getLugarConfusao() { return lugarConfusao; }
    public void setLugarConfusao(String lugarConfusao) { this.lugarConfusao = lugarConfusao; }

    public String getMarcaCerveja() { return marcaCerveja; }
    public void setMarcaCerveja(String marcaCerveja) { this.marcaCerveja = marcaCerveja; }

    public String getMotivoConfusao() { return motivoConfusao; }
    public void setMotivoConfusao(String motivoConfusao) { this.motivoConfusao = motivoConfusao; }

    public int getQuantidadeCerveja() { return quantidadeCerveja; }
    public void setQuantidadeCerveja(int quantidadeCerveja) { this.quantidadeCerveja = quantidadeCerveja; }

    public double getTemperaturaCerveja() { return temperaturaCerveja; }
    public void setTemperaturaCerveja(double temperaturaCerveja) { this.temperaturaCerveja = temperaturaCerveja; }

    @Override
    public String toString() {
        return "Meio_Psicopata{" +
                "ameacaVaga='" + ameacaVaga + '\'' +
                ", brigaConfusao='" + brigaConfusao + '\'' +
                ", carroVaga='" + carroVaga + '\'' +
                ", donoVaga='" + donoVaga + '\'' +
                ", lugarConfusao='" + lugarConfusao + '\'' +
                ", marcaCerveja='" + marcaCerveja + '\'' +
                ", motivoConfusao='" + motivoConfusao + '\'' +
                ", quantidadeCerveja=" + quantidadeCerveja +
                ", temperaturaCerveja=" + temperaturaCerveja +
                '}';
    }
}
