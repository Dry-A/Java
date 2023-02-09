package Pilha;

public class Fluxo {

    public static void main(String[] args) {


        System.out.println("Inicio do main");

        metodo1();

        System.out.println("Agora volta pro do main");
    }


    private static void metodo1() {

        System.out.println("Inicio do metodo1");

        metodo2();

        System.out.println("Agora vem para o fim do metodo1");
    }


    private static void metodo2() {

        System.out.println("Inicio do metodo2");

        for(int i = 1; i <= 3; i++) {

            System.out.println(i);
        }

        System.out.println("Fim do metodo2");
    }
    

}
