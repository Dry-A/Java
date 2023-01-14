package IfEBoolean;

import java.util.Scanner;

public class calculoIR {

    /*De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636*/
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double salTotal, aliquota, deducao, salLiq, valImposto;

        System.out.println("Qual o valor do seu salário?");
        salTotal = leia.nextInt();


        if (salTotal < 4664.0) {
            if (salTotal >= 3751.0) {
                aliquota = 22.5;
                deducao = 636;
                valImposto = ((salTotal - deducao) * aliquota / 100);
                salLiq = salTotal - valImposto;
                System.out.printf("O seu salario é  R$ %.2f e você pôde deduzir  R$ %.2f , sua aliquota foi de   %.2f\n Você pagou  R$ %.2f de imposto e lhe sobraram %.2f", salTotal, deducao, aliquota, valImposto, salLiq);
            } else if (salTotal >= 2800.01) {
                aliquota = 15;
                deducao = 350;
                valImposto = ((salTotal - deducao) * aliquota / 100);
                salLiq = salTotal - valImposto;
                System.out.printf("O seu salario é  R$ %.2f e você pôde deduzir  R$ %.2f , sua aliquota foi de  %.2f. \n Você pagou  R$ %.2f de imposto e lhe sobraram R$ %.2f", salTotal, deducao, aliquota, valImposto, salLiq);
            } else if (salTotal >= 1900.0) {
                aliquota = 7.5;
                deducao = 142;
                valImposto = ((salTotal - deducao) * aliquota / 100);
                salLiq = salTotal - valImposto;
                System.out.printf("O seu salario é  R$ %.2f e você pôde deduzir  R$ %.2f , sua aliquota foi de  %.2f. \n Você pagou  R$ %.2f de imposto e lhe sobraram  R$ %.2f", salTotal, deducao, aliquota, valImposto, salLiq);

            } else {
                System.out.println("Valor fora da tributação");
            }
        }
    }
}