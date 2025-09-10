package atividade3_VikMuniz_Mona;

public class Main {
    public static void main(String[] args) {
        Geleia geleia = new Geleia("Morango", "Vermelho", "Cremosa");
        ManteigaAmendoim manteiga = new ManteigaAmendoim("Skippy", "Crocante", 150);
        MonaLisa mona = new MonaLisa("Alimentos", "Enigmática", "Vik Muniz");

        geleia.espalhar();
        manteiga.modelar();
        mona.exibir();
    }
}
