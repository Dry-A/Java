package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoFilmes {
    public static void main(String[] args) {

        String filme1 = "Rock 3 - A hora da verdade";
        String filme2 = "Perfume de Mulher";
        String filme3 = "Grease, nos tempos da Brilhantina";
        String filme4 = "Ghost - do outro lado da vida";
        String filme5 = "Uma linda mulher";
        String filme6 = "O casamento do meu melhor amigo";
        String filme7 = "Barraca do Beijo";
        String filme8 = "Os outros";
        String filme9 = "Em busca da Felicidade";
        String filme10 = "Gente Grande";

        ArrayList<String> filmesPreferidos = new ArrayList<>();

        filmesPreferidos.add(filme2);
        filmesPreferidos.add(filme3);
        filmesPreferidos.add(filme9);
        filmesPreferidos.add(filme4);

        ArrayList<String> filmesChatos = new ArrayList<>();

        filmesChatos.add(filme7);
        filmesChatos.add(filme10);
        filmesChatos.add(filme5);

        System.out.println("filmes chatos: " + filmesChatos);
        System.out.println("filmes preferidos: " + filmesPreferidos);

        filmesPreferidos.remove(filme2);
        filmesChatos.remove(1);

        System.out.println("filmes preferidos: " + filmesPreferidos);
        System.out.println("filmes chatos: " + filmesChatos);

        System.out.println(" ");
        System.out.println("******* Com foreach *********");

        System.out.println("-----filmes chatos");
        for (String filminho:filmesChatos) {

            System.out.println("Filme: "+ filminho);
        }
        System.out.println("-----filmes preferidos");

        for (String filminho: filmesPreferidos ) {

            System.out.println("Filme: "+ filminho);
        }

        System.out.println(" ");
        System.out.println("**** Pelo metodo get *****");
        String primeiroFilme = filmesChatos.get(0);
        System.out.println(primeiroFilme);

        System.out.println(" ");
        System.out.println(" ***** Pelo método forEach *****");

        filmesPreferidos.forEach(filmao ->{
            System.out.println("Filme: " + filmao);
        });

        System.out.println("****** for para índice ******");

        for (int i = 0; i < filmesChatos.size(); i++) {

            System.out.println("aula: "+ filmesChatos.get(i));

        }

        System.out.println("Quantidade de filmes na lista: "+filmesChatos.size());


     //collections

        System.out.println("-----Collections-------");

        filmesChatos.add("As Branquelas ");
        filmesChatos.add("Todo mundo em Pânico");
        filmesChatos.add("Indiana Jhones");

        System.out.println(filmesChatos);

        System.out.println("quantidade de filmes chatos: " + filmesChatos.size());

        Collections.sort(filmesChatos);
        System.out.println("Lista de filmes chatos em ordem com Collections.sort :\n "+filmesChatos);



    }

}
