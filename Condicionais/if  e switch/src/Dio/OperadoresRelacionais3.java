package Dio;

import java.util.Scanner;

public class OperadoresRelacionais3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);


        String mesF;

        System.out.println("Que mês? ");
        mesF = leia.nextLine();

        switch (mesF) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("férias");
                break;
            default:
                System.out.println("Indefinido");
                break;
        }

    }
}
