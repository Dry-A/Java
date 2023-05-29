package lacos;

import java.util.Scanner;

public class MaiorEMedia {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;

        int maior = 0;
        int contador = 0;

        do {

            System.out.println("Digite um numero: ");
            numero = leia.nextInt();

            soma += numero;


            if (numero > maior) maior = numero;


            contador++;

        } while (contador < 5);

        //System.out.println("Maior "+ maior);

        System.out.println("A Média das notas é  " + soma / 5);

    }
}
