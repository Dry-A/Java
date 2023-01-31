package loops;

import java.util.Scanner;

public class nota {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int nota;



        System.out.println("Digite um valor");
        nota=leia.nextInt();

        while(nota <0 | nota >10){

            System.out.println("nota inválida, digite uma nota entre 0 e 10: ");
            nota = leia.nextInt();


        }





    }
}
