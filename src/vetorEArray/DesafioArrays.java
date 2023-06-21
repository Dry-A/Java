import java.util.Scanner;

public class DesafioArrays {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtddNotas;
        System.out.println("Quantas notas voce quer informar? ");
        qtddNotas = leia.nextInt();

        double[] notas = new double[qtddNotas];

        for (int i =0; i< qtddNotas; i++){

            System.out.println("Digite a nota"+ (i+1) + ": ");
            notas[i] = leia.nextDouble();

        }


        double total = 0;
        for (double nota:notas
             ) {

            total+=nota;

        }

        double media = total / notas.length;
        System.out.println("A média é  "+ media);

        leia.close();

    }
}
