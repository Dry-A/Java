package condicionais;

import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual nome do seu cliente ? ");
        String nome = leia.nextLine(); //nome composto

        System.out.println("Qual idade? ");
        int idade = leia.nextInt();

        System.out.println("Qual é a renda? ");
        double renda = leia.nextDouble();

        if (idade >= 18) {

            if (renda >= 100000) System.out.println("Trocar de segmento para Prime");
            else if (renda >= 3000) {

                System.out.println("Aprovado");
                if (renda >= 6000) {
                    System.out.println("Ofereça financiamento de automóvel");
                }
                if (renda >= 10000) {
                    System.out.println("Ofereça financamento imobiliário");
                }
            }
        } else {

            System.out.println("Reprovado! ");
        }

        leia.close();
    }

}