package colecoes;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Sylvester Stallone");
        pessoas.put(32, "Oliver Queen");
        pessoas.put(23, "Uthread Ragnarson");
        pessoas.put(18, "Dom Juan de Marco");

        System.out.println( pessoas.keySet());

    }


}
