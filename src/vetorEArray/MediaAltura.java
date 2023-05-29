package vetorEArray;

import java.util.Locale;
import java.util.Scanner;

public class MediaAltura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);


        int n = leia.nextInt();
        double[] vetor = new double[n];


        for (int i = 0; i < n; i++) {

            vetor[i] = leia.nextDouble();//recebe o que o usuário digitar


        }

        double soma = 0;

        for (int i = 0; i < n; i++) {

            soma += vetor[i];
        }

        double media = soma / n;

        System.out.printf("Altura média = %.2f%n ", media); //arredondar pra 2 casas

        leia.close();
    }
}
