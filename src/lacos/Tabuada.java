package lacos;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        System.out.println("Tabuada: ");
        int tabuada = leia.nextInt();

        System.out.println(" Tabuada do " + tabuada);


        for (int i = 0; i < 11; i++) {

            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));

        }


    }


}
