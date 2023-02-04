package loops;

public class Treino4 {

    public static void main(String[] args) {

        int num = 5, count = 1;
        while(count <= 3) {

            ++count;
            num += count;
        }
        System.out.println(num);
    }
}
