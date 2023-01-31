package loops;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);

        System.out.println("Qual número do fatorial? ");
        int fatorial = leia.nextInt();
        int multiplicacao=1;


        System.out.println(fatorial +"! = ");
        for (int i = fatorial  ; i>=1   ; i--  ){



            multiplicacao *= i;


        }

        System.out.println(multiplicacao);


    }
}
