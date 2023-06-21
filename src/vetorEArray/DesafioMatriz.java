package vetorEArray;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMatriz {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdeAlunos = leia.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtdeNotas = leia.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

        //for mais externo que percorre os alunos e um for mais interno, percorrer as notas

        double total = 0;

        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = leia.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Média da turma é " + media);

        for (double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        leia.close();
    }
}
