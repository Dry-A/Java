package loops;

import java.util.Scanner;

public class parImpar {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros;

        System.out.println("Quantos números você deseja informar");
        qtdNumeros= leia.nextInt();


        int contador = 0;
        int numero;
        int contPar=0;
        int contImpar=0;

         do {

             System.out.println("Número: ");
             numero = leia.nextInt();
             contador++;

             if (numero%2==0){
                 contPar++;

             }else{
                 contImpar++;
             }


         }while(contador<qtdNumeros);


        System.out.println("Números pares "+contPar);
        System.out.println("Números ímpares "+contImpar);


    }
}
