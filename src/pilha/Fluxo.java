package pilha;

public class Fluxo {

    public static void main(String[] args) {

        System.out.println("Ini do main");
        try {
            metodo1();

        } catch (ArithmeticException | NullPointerException bananinha) {

            String msg = bananinha.getMessage();

            System.out.println("Exception "+ msg);

            bananinha.printStackTrace();

        }
        System.out.println("Fim do main");
    }


    private static void metodo1() {

        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    private static void metodo2() {

        System.out.println("Ini do metodo2");

         ArithmeticException  bananinha = new ArithmeticException();

         throw bananinha;

        //System.out.println("Fim do metodo2");

    }

}


