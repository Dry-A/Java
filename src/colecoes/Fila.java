package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> playList = new LinkedList<>();

 /*adiciona elementos na fila, difere quando a fila está cheia
        add - joga uma exceção
                offer -retorna falso e nao add elementos na fila */
        /*playList.add("Bleeding Love");
        playList.offer("Loving you");
        playList.offer("The Best");
        playList.add("Pela última vez");
        playList.offer("Quem aguenta");*/
        System.out.println(playList.peek()); //retorna null se a fila estiver vazia
        System.out.println(playList.element()); // lança uma exceção se estiver vazia
        System.out.println(playList.poll());
        System.out.println(playList.poll());
        System.out.println(playList.remove());
        System.out.println(playList.poll());
        System.out.println(playList.poll());
        System.out.println(playList.poll());
        System.out.println(playList.poll());
    }
}