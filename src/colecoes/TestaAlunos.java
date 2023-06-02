package colecoes;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Monique Albuquerque");
        alunos.add("Bernardo Albuquerque");
        alunos.add("Nicole Albuquerque");
        alunos.add("Manuela Albuquerque");
        alunos.add("Davi Albuquerque");
        alunos.add("Davi Albuquerque");

        System.out.println(alunos);

        System.out.println("******** for each ***********");

        for (String aluno : alunos
        ) {
            System.out.println(aluno);

        }

        System.out.println("********************** Lambda ****************");
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        boolean moniqueEstaMatriculado = alunos.contains("Monique Albuquerque");

        System.out.println(moniqueEstaMatriculado);

        System.out.println(alunos.size());

        alunos.remove("Davi Albuquerque");

        System.out.println(alunos.size());


        Collection<String> frutas = new ArrayList<>();

        Collection<String> filhos = new HashSet<>();

        Collection<String> amigas = new LinkedList<>();

        frutas.add("manga");
        frutas.add("uva");
        frutas.add("maça gala");
        frutas.add("abacaxi pérola");

        System.out.println(frutas);

        filhos.add("Gessica");
        filhos.add("Giovanne");
        filhos.add("Gianini");
        filhos.add("Guilherme");
        filhos.add("Gabriel");

        System.out.println(filhos);

        amigas.add("Gerle");
        amigas.add("Michele");
        amigas.add("Cintia");
        amigas.add("Patricia");

        System.out.println(amigas);

        List<String> meusCarros = new LinkedList<>();

        meusCarros.add("Polo");
        meusCarros.add("Kicks");
        meusCarros.add("Ix35");
        meusCarros.add("Peugeot 3008");

        System.out.println(meusCarros);

        int quantiddCarros = meusCarros.size();

        System.out.printf("Eu tenho %d carros. ", quantiddCarros);

        System.out.println("\n" + meusCarros.get(2));

        System.out.println(meusCarros.size());
        meusCarros.remove(0);

        System.out.println(meusCarros);

    }
}
