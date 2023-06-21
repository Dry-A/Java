package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjuntinho = new HashSet<>();

        conjuntinho.add(1.2);
        conjuntinho.add(true);
        conjuntinho.add("testando testando...");
        conjuntinho.add(45);
        conjuntinho.add('m');
        //vai converter todos os tipos primitivos para wrapper
        System.out.println("Tamanho do conjunto é " + conjuntinho.size());

        conjuntinho.add("Testando testando");

        conjuntinho.add('m'); //este sera ignorado

        System.out.println("Tamanho do conjunto é " + conjuntinho.size());

        conjuntinho.add("Brilha brilha estrelinha");

        conjuntinho.add('f');

        System.out.println("Tamanho do conjunto é " + conjuntinho.size());

        System.out.println(conjuntinho.contains('f'));

        conjuntinho.remove('f');
        conjuntinho.remove("Brilha brilha estrelinha");

        System.out.println("Tamanho do conjunto é " + conjuntinho.size());

        Set numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros);
        System.out.println(conjuntinho);

        conjuntinho.add(numeros);
        System.out.println(conjuntinho);



    }

}
