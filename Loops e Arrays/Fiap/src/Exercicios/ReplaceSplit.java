package estruturaRepeticaoArraysStringColecoes;

import java.util.Arrays;

public class ReplaceSplit {
    public static void main(String[] args) {


        String descricao = new String("Pera Williams, a pera mais doce do mercado!");

        System.out.println(descricao.replace("W","w"));
        System.out.println(descricao.replace("Williams","D'água"));
        System.out.println(descricao.replace("a","A"));

        System.out.println(descricao.split(" ").length); //numero de palavras

        System.out.println(Arrays.toString(descricao.split(" ")));


    }

}
