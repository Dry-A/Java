package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "1.Conhecendo mais de listas";
        String aula2 = "2.Modelando a classe Aula";
        String aula3 = "3.Trabalhando com Cursos e Sets";
        String aula4 = "4.Bananinha quando nasce";
        String aula5 = "5.Pôe a mão no coração";
        int idade = 20;
        String aula6 = "6.Como plantar girassol";
        String aula7 = "7.Fazendo bolo de maçã";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);
        aulas.add(aula5);
        aulas.add(aula6);
        aulas.add(aula7);

        //para ver o que tem na ArrayList
        System.out.println(aulas);

        aulas.remove(1);//2.modelando a classe....
        System.out.println(aulas);
        aulas.remove(aula6);
        System.out.println(aulas);

        //ou usando um for:
        for (String aula : aulas) {

            System.out.println(aula);

        }

        //ou usando o get:
        String primeiraAula = aulas.get(0);
        String segundaAula = aulas.get(1);
        String melhoraula = aulas.get(3);

        System.out.println("A aula 4 é " + aula4);


        //usando o for para o indice

        for (int i = 0; i < aulas.size(); i++) {

            System.out.println("aula: "+ aulas.get(i));

        }

        System.out.println(aulas.size());

        aulas.forEach(aula ->{
            System.out.println("iouhuuuu - percorrendo: " + aula);
        });
        //classe Collections

        System.out.println("-----Collections-------");

        aulas.add("0.Aumentando nosso conhecimento");

        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println(" ");
        System.out.println("*****com o sort agora, e números vem antes de letras*****");
        System.out.println("  ");
        System.out.println(aulas);


    }
}