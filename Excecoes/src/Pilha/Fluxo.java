package Pilha;

public class Fluxo {

    public static void main(String[] args) {


        System.out.println("Inicio do main");
        try {
            metodo1();

        } catch (ArithmeticException | NullPointerException  ex){//nome da classe, é uma classe , e ex é uma referencia a um objeto e com ela podemos chamar metodos da classe

            String msg = ex.getMessage(); //pego a mensagem e guardo dentro da variavel msg, que é do tipo String

            System.out.println("Exception "+ msg);

            //me mostra seu rastro? Por onde vc passou? Sim:

            ex.printStackTrace(); //rastro

        }


        System.out.println("Agora volta pro fim do main");
    }


    private static void metodo1() {

        System.out.println("Inicio do metodo 1");

        metodo2();

        System.out.println("Agora vem para o fim do metodo 1");
    }


    private static void metodo2(){

        System.out.println("início metodo 2");

            metodo3();

        System.out.println("Fim do método 2");

    }


    private static void metodo3() {

        System.out.println("Inicio do metodo 3");

        for(int i = 1; i <= 3; i++) {

            System.out.println(i);

           int a =1/0;
           // Conta c = null;
           //c.deposita();

        }

        System.out.println("Fim do metodo 3");
    }


}
