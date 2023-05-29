package vetorEArray;

import java.util.Arrays;

public class PreenchimentoAutomatico {

    public static void main(String[] args) {

        int[] num = new int[30];

        Arrays.fill(num, 10);

        for (int valor : num
        ) {
            System.out.println(valor + " ");

        }

    }
}
