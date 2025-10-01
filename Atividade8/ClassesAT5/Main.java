package atividade5_video;

public class Main {
    public static void main(String[] args) {
        Acougueiro a = new Acougueiro("João", true, "picanha");
        a.cortar();
        a.entregar();
        a.afirmar();

        Personagem p = new Personagem("Carlos", 10, true);
        p.correr();
        p.escapar();
        p.entrar();

        Telefone t = new Telefone("preto", "celular", true);
        t.tocar();
        t.receberChamada();
        t.desligar();
    }
}
