package colecoes;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {
    public static void main(String[] args) {

        // Imagina que você quer pegar os que foram lançados em um determinado ano.
        Set carros = getCarrosDoAno(2020);

        System.out.println("Neste ponto, pegamos a lista vazia, pois vai cair no default do switch : " + carros);

        // Ele cria uma lista imultavel, ou seja, nao conseguimos adicionar
        carros.add("Adding");
    }

    public static Set<String> getCarrosDoAno(int ano) {

        switch (ano) {
            case 2021: {
                return Set.of("carro a", "carro b", "carro c", "carro d");
            }
            default:
                // FORMA 1
                return Collections.emptySet();
            // FORMA 2
//          return Collections.unmodifiableSet(new HashSet<String>());
            // FORMA 3
//          return new HashSet<String>();

        }

    }
}