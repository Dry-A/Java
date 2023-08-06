package BeeCrowd;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leitura das notas A e B
        double notaA = input.nextDouble();
        double notaB = input.nextDouble();
        double notaC = input.nextDouble();
        // Restrição das notas até 10.0
        if (notaA > 10.0) {
            notaA = 10.0;
        }
        if (notaB > 10.0) {
            notaB = 10.0;
        }
        if (notaC > 10.0) {
            notaC = 10.0;
        }
        // Cálculo da média ponderada
        double media = (notaA * 2 + notaB * 3 + notaC * 5) / 10;
        // Impressão do resultado
        System.out.printf("MEDIA = %.1f%n", media);

        input.close();
    }
}