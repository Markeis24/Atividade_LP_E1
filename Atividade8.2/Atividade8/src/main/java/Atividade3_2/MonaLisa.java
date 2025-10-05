package Atividade3_2;

public class MonaLisa {
    private String artista;
    private String tecnica;
    private String expressao;
    private String materialBase;

    public MonaLisa() {}

    public MonaLisa(String artista, String tecnica, String expressao, String materialBase) {
        this.artista = artista;
        this.tecnica = tecnica;
        this.expressao = expressao;
        this.materialBase = materialBase;
    }

    public String getArtista() { return artista; }
    public void setArtista(String artista) { this.artista = artista; }

    public String getTecnica() { return tecnica; }
    public void setTecnica(String tecnica) { this.tecnica = tecnica; }

    public String getExpressao() { return expressao; }
    public void setExpressao(String expressao) { this.expressao = expressao; }

    public String getMaterialBase() { return materialBase; }
    public void setMaterialBase(String materialBase) { this.materialBase = materialBase; }

    @Override
    public String toString() {
        return "MonaLisa{" +
                "artista='" + artista + '\'' +
                ", tecnica='" + tecnica + '\'' +
                ", expressao='" + expressao + '\'' +
                ", materialBase='" + materialBase + '\'' +
                '}';
    }
}