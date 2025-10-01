package atividade3_VikMuniz_Che;

public class Main {
    public static void main(String[] args) {
        Feijao feijao = new Feijao("Carioca", 200, "Macio");
        Molho molho = new Molho("Vermelho", "Picante", 1.5);
        Retrato retrato = new Retrato("Humano", 0.8, "Prato");

        feijao.cozinhar();
        molho.espalhar();
        retrato.exibir();
    }
}
