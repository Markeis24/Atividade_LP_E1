package atividade5_video;

public class Personagem{
        private String nome;
        private int tempoRestante;
        private boolean emFuga;

        public Personagem(String nome, int tempoRestante, boolean emFuga) {
            this.nome = nome;
            this.tempoRestante = tempoRestante;
            this.emFuga = emFuga;
        }

        public void correr() {
            if (emFuga) {
                System.out.println(nome + " está correndo! Tempo restante: " + tempoRestante);
            } else {
                System.out.println(nome + " está parado.");
            }
        }

        public void escapar() {
            System.out.println(nome + " tentou escapar...");
        }

        public void entrar() {
            System.out.println(nome + " entrou em um lugar seguro.");
        }
}
