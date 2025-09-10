package TestedeMesa;

public class TesteMesa {
    public static double calcularMedia(double P1, double E1, double E2, double X, double SUB, double API) {
        double base = P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + (SUB * 0.15);
        double parte1 = base * 0.5;
        double parte2 = (Math.max(base - 5.9, 0)) / (base - 5.9 == 0 ? 1 : (base - 5.9)) * API * 0.5;
        return parte1 + parte2;
    }

    public static void main(String[] args) {
        double[][] cenarios = {
                // P1, E1, E2, X, SUB, API
                {2,10,5,8,0,4}, // 1) aluno não fez P1 mas foi bem nas outras
                {0,10,8,9,8,9}, // 2) aluno foi bem em tudo
                {5,8,7,9,0,8}, // 3) aluno mediano
                {4,5,6,7,0,9}, // 4) aluno não entregou nada
                {0,5,5,7,9,6}, // 5) só fez P1
                {8,9,7,6,0,8}, // 6) só fez E1
                {9,8,7,10,0,9}, // 7) só fez E2
                {7,10,8,3,0,7}, // 8) notas medianas em tudo
                {3,7,6,9,0,6}, // 9) SUB alto compensa P1 fraco
                {10,10,9,9,0,10} // 10) bom desempenho mas sem SUB/X
        };

        for (int i = 0; i < cenarios.length; i++) {
            double P1 = cenarios[i][0];
            double E1 = cenarios[i][1];
            double E2 = cenarios[i][2];
            double X = cenarios[i][3];
            double SUB = cenarios[i][4];
            double API = cenarios[i][5];

            double media = calcularMedia(P1, E1, E2, X, SUB, API);
            System.out.printf("Cenário %d -> Média final: %.2f%n", (i + 1), media);
            if(media>=6) {
                System.out.println("APROVADO");
                System.out.println();
            }
            else {
                System.out.println("REPROVADO");
                System.out.println();
            }
        }
    }
}
