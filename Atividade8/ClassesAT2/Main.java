package atividade2_musica;

public class Main {
    public static void main(String[] args) {
        Cerveja cerveja = new Cerveja();
        cerveja.setMarca("Skol");
        cerveja.setQuantidade(3);
        cerveja.setTemperatura(4.5);
        cerveja.beber();

        Confusao confusao = new Confusao();
        confusao.setBriga("Discussão acalorada");
        confusao.setMotivo("vaga de carro");
        confusao.setLugar("bar da esquina");
        confusao.comecar();

        Vaga vaga = new Vaga();
        vaga.setDono("Carlos");
        vaga.setCarro("Fusca azul");
        vaga.setAmeaca("Multa se estacionar errado");
        vaga.verificar();
    }
}
