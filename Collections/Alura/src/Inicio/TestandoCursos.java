package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoCursos {

    public static void main(String[] args) {

        String curso1 = "Java Collections";
        String curso2 = "Linux Fundamentos";
        String curso3 = "Docker";
        String curso4 = "Spring Boot";
        String curso5 = "Microsserviços";
        String curso6 = "Testes";


        ArrayList<String> cursosQuePrecisoFazer = new ArrayList<>();


        cursosQuePrecisoFazer.add(curso1);
        cursosQuePrecisoFazer.add(curso6);
        cursosQuePrecisoFazer.add(curso4);

        System.out.println("************** com foreach *************");


        for (String meusCursos: cursosQuePrecisoFazer ) {

            System.out.println("Prioridade: " + meusCursos);
        }

        System.out.println("************** sem foreach *************");


        System.out.println(cursosQuePrecisoFazer);

        System.out.println("************** com método get *************");

        String primeiroCurso = cursosQuePrecisoFazer.get(0);
        System.out.println(primeiroCurso);

        System.out.println("************** com método forEach  *************");

        cursosQuePrecisoFazer.forEach(curso->{

            System.out.println("Preciso desse curso: "+ curso);
        });

        System.out.println("************** com Classe collections e sort  *************");
        Collections.sort(cursosQuePrecisoFazer);
        System.out.println(cursosQuePrecisoFazer);

        cursosQuePrecisoFazer.remove(0);
        System.out.println(cursosQuePrecisoFazer);
        System.out.println("Quantidade de cursos prioritários: "+ cursosQuePrecisoFazer.size());
    }
}
