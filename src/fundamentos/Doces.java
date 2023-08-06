package fundamentos;

import java.util.Scanner;

public class Doces {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int moeda = leia.nextInt();

        int doce = 2;

        int resultado = moeda * doce;

        System.out.println(resultado);

    }
}
