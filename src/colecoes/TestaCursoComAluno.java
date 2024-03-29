package colecoes;

import java.util.*;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso colecoesCursos = new Curso("Dominando as Coleções Java", "Paulo Silveira");

        colecoesCursos.adiciona(new Aula("Trabalhando com ArrayList", 14));
        colecoesCursos.adiciona(new Aula("Modelando com coleções", 25));
        colecoesCursos.adiciona(new Aula("Entendendo Set", 21));


        Aluno a1 = new Aluno("Isabela Venturini", 52366);
        Aluno a2 = new Aluno("Cesar Oliveira", 45225);
        Aluno a3 = new Aluno("Pedro Moretti", 23665);


        colecoesCursos.matricula(a1);
        colecoesCursos.matricula(a2);
        colecoesCursos.matricula(a3);

        System.out.println("Alunos matriculados no curso :   COM ITERATOR");

        Set<Aluno> alunos = colecoesCursos.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();

        while (iterador.hasNext()) {

            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

        System.out.println("  ");
        System.out.println("********** com forEach ***********");

        colecoesCursos.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("  ");
        System.out.println(" Com boolean ");

        System.out.println("O aluno " + a1 + " está matriculado?");

        System.out.println(colecoesCursos.estaMatriculado(a1));

        Aluno isabela = new Aluno("Isabela Venturini", 8588);

        System.out.println("e esta Venturini? Está matriculada?");

        System.out.println(colecoesCursos.estaMatriculado(isabela));
        //por que deu falso? o Set tem uma tabela de espalhamento

        System.out.println("O a1 é equals a Isabela?");
        System.out.println(a1.equals(isabela)); //a1 é igual a macedo?

    }
}
