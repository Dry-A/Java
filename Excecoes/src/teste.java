import java.util.Arrays;

public class teste {

    public static void main(String[] args) {


        /*int x = 0;


        for (x = 0; x <= 10; x++) {

            if (x == 6) {
                x += x + 6;
            }
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }



        int a, b, c;
        a = 557;
        b=0;
        c = 835;

        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(c);*/


        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.stream(a).count (9);
        System.out.println(a);


    }


}