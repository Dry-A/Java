package colecoes;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso bananinhaColecoes = new Curso("Dominando as Coleções Java", "Paulo Silveira");

        List<Aula> aulas = bananinhaColecoes.getAulas();

        System.out.println(aulas);

        /*aulas.add(new Aula("Trabalhando com ArrayList", 18));
        //ou
        bananinhaColecoes.getAulas().add(new Aula("Trabalhando com LinkedList", 22));

        //ou podemos chamar o metodo adiciona
        bananinhaColecoes.adiciona(new Aula("Entendendo Set", 17));

        System.out.println(bananinhaColecoes.getAulas());

        //ou
        System.out.println(aulas);*/

        //usando o Collections.unmodifiableList:

        bananinhaColecoes.adiciona(new Aula("Trabalhando com ArrayList",14));
        System.out.println(bananinhaColecoes.getAulas());
    }
}
