package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {
    public static void main(String[] args) {

        Aula a1 = new Aula("Aprendendo ArrayList", 22);
        Aula a2 = new Aula("Lista de objetos", 30);
        Aula a3 = new Aula("Relacionando de lista e objetos",15);

        ArrayList<Aula> listaDeAulas = new ArrayList<>();

        listaDeAulas.add(a2);
        listaDeAulas.add(a1);
        listaDeAulas.add(a3);

        System.out.println(listaDeAulas); //mostra o hashcode - id único dos objetos e nao os nomes SE NÃO TIVER O TOsTRING NA CLASSE

        Collections.sort(listaDeAulas); //ordenando alfabeticamente

        System.out.println(listaDeAulas);

        /*
        método comparação
        String s1 = "audrey";
        String s2 = "giovanna";
        System.out.println(s1.compareTo(s2));*/

        Collections.sort(listaDeAulas, Comparator.comparing(Aula::getTempo));

        System.out.println(listaDeAulas);


    }
}
