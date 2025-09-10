package atividade4_imagemDoodle;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Giovana", 20, "Futebol");
        Evento evento = new Evento("Festival de Food Truck", "Praça Central", 500);
        Musica musica = new Musica("Coldplay", "Rock Alternativo", 4.5);

        pessoa.interagir();
        pessoa.praticarEsporte();
        pessoa.comer();

        evento.divulgar();
        evento.iniciar();
        evento.encerrar();

        musica.tocar();
        musica.pausar();
        musica.encerrar();
    }
}
