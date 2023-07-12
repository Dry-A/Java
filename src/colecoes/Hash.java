package colecoes;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();
        usuarios.add(new Usuario("Pedro"));;
        usuarios.add(new Usuario("Giovanna"));
        usuarios.add(new Usuario("Cleber"));

        //só funciona se na classe usuario o hashcode estiver ativo
        boolean encontrouCleber = usuarios.contains(new Usuario("Cleber"));
        System.out.println(encontrouCleber);
    }
}