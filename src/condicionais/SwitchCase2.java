package condicionais;

import java.util.Scanner;

public class SwitchCase2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String diaSemana;
        int n,x;

        System.out.println("Qual dia da semana?");
        diaSemana = leia.nextLine();

        switch (diaSemana){

            case "Domingo": {
                System.out.println("1");
            break;

            }case "Segunda": {
                System.out.println("2");
                break;

            }case "Terça": {
                System.out.println("3");
                break;

            }case "Quarta": {
                System.out.println("4");
                break;

            }case "Quinta": {
                System.out.println("5");
                break;

            }case "Sexta": {
                System.out.println("6");
                break;

            }case "Sábado": {
                System.out.println("7");
                break;

            }
            default:
                System.out.println("Dia indefinido");

        }



        System.out.println("digite um número inteiro: ");
        n = leia.nextInt();

        //melhor switch:

        switch (n){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("talvez");
                break;
            default:
                System.out.println("Indefinido");
                break;


            }

        System.out.println("digite um número inteiro: ");
        x = leia.nextInt();

        switch (x) {
            case 10, 20, 30 -> System.out.println("Certo");
            case 40 -> System.out.println("Errado");
            case 50 -> System.out.println("talvez");
            default -> System.out.println("Indefinido");
        }



        }


    }

