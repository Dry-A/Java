package colecoes;

import java.util.ArrayList;
import java.util.Collections;

public class TestaAula {

    public static void main(String[] args) {

        String aula1 = "Fazendo beijinhos cremosos";
        String aula2 = "Como enrolar brigadeiros mais rápido";
        String aula3 = "Como preparar brigadeiros macios e cremosos";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula1);

        String aula4 = "Faça coxinhas crocantes e sequinhas";

        System.out.println(aulas);

        aulas.add(aula4);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        //formas de percorrer uma lista

        //foreach
        for (String aula : aulas
        ) { //para cada aula do tipo String, que está na minha lista chamada aulas
            System.out.println("Nome da aula -> " + aula);
        }

        //com metodo forEach:
        aulas.forEach(aula -> {
            System.out.println("percorrendo: " + aula);
        }); //para cada aula em aulas, faça:


        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {

            System.out.println("aula -> " + aulas.get(i));
        }

        System.out.println("Total de elementos na lista: " + aulas.size());

        //ordenando

        aulas.add("Como vender os docinhos");
        Collections.sort(aulas);
        System.out.println(aulas);

    }
}
