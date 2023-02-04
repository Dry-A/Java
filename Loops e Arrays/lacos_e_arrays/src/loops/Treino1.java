package loops;

import java.util.Scanner;

public class Treino1 {

    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);

        int num = 5, count = 1;

        do {
            num += count;

            System.out.println(num);


        } while (count <= 3);


    }
}
