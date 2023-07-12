package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetConjuntoComportado {

    public static void main(String[] args) {

        //Set<String> listaItens = new HashSet<>();
        SortedSet<String> listaItens = new TreeSet<>(); //para manter a ordem alfabetica
        listaItens.add("Teclado multi-device");
        listaItens.add("Luz em barra para monitor");
        listaItens.add("Braço articulado com pistão");
        listaItens.add("Suporte para fone");
        listaItens.add("Fone de ouvido sem fio");
        listaItens.add("Calha para fios");
        listaItens.add("Tampo de pinus");
        listaItens.add("Camera logitech");
        listaItens.add("Suporte vertical para notebook");
        listaItens.add("Desk pad 90 x40");

        System.out.println("Essa é a lista dos itens que você comprou: ");

        for (String itens: listaItens
        ) {
            System.out.println(itens);

        }

        Set<Integer> senhas = new HashSet<>();

        senhas.add(12);
        senhas.add(24);
        senhas.add(42);
        senhas.add(44);

        System.out.println("As senhas são: ");

        for (int n : senhas
        ) {
            System.out.println(senhas);

        }

    }

}
