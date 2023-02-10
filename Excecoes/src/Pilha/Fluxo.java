package Pilha;

public class Fluxo {

    public static void main(String[] args) {


        System.out.println("Inicio do main");

        metodo1();

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

           try{ int a =1/0;
           } catch (ArithmeticException ex){

               System.out.println("ArithmeticException ");
           }

        }

        System.out.println("Fim do metodo 3");
    }


}
