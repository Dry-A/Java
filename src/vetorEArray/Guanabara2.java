package vetorEArray;

public class Guanabara2 {
    public static void main(String[] args) {

        String mes[] = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago",
                "set", "out", "nov", "dez"};


        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int c = 0; c < mes.length; c++) {

            System.out.println("o mês de " + mes[c] + " tem " + tot[c] + " dias ao todo.");

        }

    }
}
