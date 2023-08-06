package BeeCrowd;

import java.util.Scanner;

public class MediaUam {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double A1 = input.nextDouble();
        double A2 = input.nextDouble();
        double A3 = input.nextDouble();

        double media = (A1 * 3 + A2 * 3 + A3 * 4) / 10;

        System.out.println("Média das 2 notas é: " + String.format("%.2f", media).replace(",", "."));

        input.close();

    }
}
