package colecoes;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosCurso {

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


        System.out.println("quem é o aluno com a matricula 45225");

        Aluno aluno = colecoesCursos.buscaMatriculado(45225);

        //Aluno aluno = colecoesCursos.buscaMatriculado(52236);
        System.out.println("Aluno : " + aluno);

        //Um mapa que mapeia uma chave de matricula , não só para um aluno, mas para um SET(Conjunto) de alunos
        Map<Integer, Set<Aluno>> variavelMatriculaParaAlunos;
    }
}
