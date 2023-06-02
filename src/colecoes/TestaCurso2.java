package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {


        Curso bananinhaColecoes = new Curso("Dominando as Coleções Java", "Paulo Silveira");

        bananinhaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 14));
        bananinhaColecoes.adiciona(new Aula("Modelando com coleções", 25));
        bananinhaColecoes.adiciona(new Aula("Trabalhando com Map", 19));

        List<Aula> aulasImutaveis = bananinhaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(bananinhaColecoes.getTempoTotal());

        System.out.println(bananinhaColecoes);
    }
}