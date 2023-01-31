package arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        String[] consoantes = new String[6] ;

        int qtddConsoantes = 0;

        int contador = 0 ;

        do{

            System.out.println("Digite uma letra: ");
            String letra = leia.next();


            if( !(letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
            letra.equalsIgnoreCase("i")|
            letra.equalsIgnoreCase("o")|
            letra.equalsIgnoreCase("u")) ){

                consoantes[contador] = letra;

                qtddConsoantes++;
            }

            contador++;


        }while (contador<consoantes.length);


        System.out.println("Consoantes : ");

        for ( String consoante  : consoantes ) {

            if (consoante !=null);

            System.out.print(consoante+ " ");

        }

        System.out.println("quantidade consoantes : "+qtddConsoantes);

    }
}
