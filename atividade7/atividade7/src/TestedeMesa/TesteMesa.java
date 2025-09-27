public class TesteMesa {
    public static double calcularMedia(double P1, double E1, double E2, double X, double SUB, double API) {
        double base = P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + (SUB * 0.15);
        double parte1 = base * 0.5;

        double parte2 = 0;
        if (base > 5.9) {
            parte2 = API * 0.5;
        }

        double media = parte1 + parte2;

        return Math.min(media, 10.0);
    }

    public static void main(String[] args) {
        double[][] cenarios = {
                // P1, E1, E2, X, SUB, API
                {2,3,5,5,0,4},
                {0,10,8,9,8,9},
                {5,8,6,9,0,3},
                {4,5,6,7,0,9},
                {0,5,5,7,9,6},
                {8,9,7,6,0,8},
                {9,8,7,10,0,9},
                {7,10,8,3,0,7},
                {3,7,6,9,0,6},
                {10,10,10,10,0,10}
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
                System.out.println("");
            } else {
                System.out.println("REPROVADO");
                System.out.println("");
            }
        }
    }
}
