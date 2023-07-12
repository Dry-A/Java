package colecoes;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        //posso criar desses 2 jeitos
        Usuario u1 = new Usuario("Amanda");
        lista.add(u1);
        //ou
        lista.add(new Usuario("Anselmo Marcelo"));
        lista.add(new Usuario("Mariana Rabelo"));
        lista.add(new Usuario("Robson Amaral"));
        lista.add(new Usuario("Pietro De Castro"));
        lista.add(new Usuario("Bob Marley"));

        System.out.println("usuário no indice 3: "+lista.get(3)); //vai usar o toString
        System.out.println("usuário no índice 0: "+lista.get(0));//em List pode acessar pelo índice

        System.out.println("Imprimindo com foreach: ");
        for (Usuario u : lista) {
            System.out.println(u.nome);
        }

        System.out.println(lista.remove(0));
        System.out.println("");
        System.out.println("Removi o primeiro índice: ");

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }

        System.out.println(lista.remove(new Usuario("Manu")));
        System.out.println(lista.remove(new Usuario("Pietro de Castro")));
        System.out.println(lista.contains(new Usuario("Mariana Rabelo"))); // só funciona com equals e haschcode
    }
}