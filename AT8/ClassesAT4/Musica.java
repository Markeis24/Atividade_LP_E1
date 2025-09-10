package atividade4_imagemDoodle;

public class Musica {
    private String banda;
    private String genero;
    private double duracao;

    public Musica(String banda, String genero, double duracao) {
        this.banda = banda;
        this.genero = genero;
        this.duracao = duracao;
    }

    public void tocar() {
        System.out.println("A música da banda " + banda + " está tocando.");
    }

    public void pausar() {
        System.out.println("A música foi pausada.");
    }

    public void encerrar() {
        System.out.println("A música terminou.");
    }
}
