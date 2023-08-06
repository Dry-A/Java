package BeeCrowd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int N = scanner.nextInt(); // Número de torneios
            int M = scanner.nextInt(); // Número de alunos
            if (N == 0 && M == 0) break; // Condição de saída

            int[] coeficientes = new int[N]; // Coeficientes da função

            for (int i = 0; i < N; i++) {
                coeficientes[i] = scanner.nextInt();
            }

            boolean isPossivel = verificarClassificacao(coeficientes, M);
            if (isPossivel) {
                System.out.println("Lucky Denis!");
            } else {
                System.out.println("Try again later, Denis...");
            }
        }

        scanner.close();
    }

    private static boolean verificarClassificacao(int[] coeficientes, int M) {
        Arrays.sort(coeficientes); // Ordenar os coeficientes em ordem crescente
        Set<Integer> diferentes = new HashSet<>();

        for (int i = 0; i < coeficientes.length; i++) {
            diferentes.add(coeficientes[i]);
            if (diferentes.size() > M) {
                return false;
            }
        }

        return diferentes.size() == M;
    }
}