package colecoes;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso colecoesCursos = new Curso("Dominando as Coleções Java", "Paulo Silveira");

        colecoesCursos.adiciona(new Aula("Trabalhando com ArrayList", 14));
        colecoesCursos.adiciona(new Aula("Modelando com coleções", 25));
        colecoesCursos.adiciona(new Aula("Entendendo Set", 21));


        Aluno a1 = new Aluno("isabela Venturini", 52366);
        Aluno a2 = new Aluno("Cesar Oliveira", 45225);
        Aluno a3 = new Aluno("Pedro Moretti", 23665);


        colecoesCursos.matricula(a1);
        colecoesCursos.matricula(a2);
        colecoesCursos.matricula(a3);

        System.out.println("Alunos matriculados no curso :");

        colecoesCursos.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });


    }
}
