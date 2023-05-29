package vetorEArray;

import java.util.Arrays;

public class ArrayBusca {
    public static void main(String[] args) {


        int[] bananinha = {5,2,253,232,25,84};
        Arrays.sort(bananinha);

        for (int vetor : bananinha             ) {

            System.out.println(vetor);

        }
        System.out.println(" ");

        int pos = Arrays.binarySearch(bananinha, 25); // busca binária - key é o valor que eu quero

        System.out.println("Encontrei o valor na posição "+ pos );

    }
}
