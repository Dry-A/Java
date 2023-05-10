package estruturaRepeticaoArraysStringColecoes;

public class CharAtIndexlastIndexOf {
    public static void main(String[] args) {


        String descricao =
                new String ("Pera Williams, a pera mais doce do mercado!");

        System.out.println(descricao.charAt(1));//indice - posição

        System.out.println(descricao.indexOf("P")); //posição da letra P

        System.out.println(descricao.indexOf("Williams"));//indice

        System.out.println(descricao.indexOf("a"));//posição do indice do primeiro a

        System.out.println(descricao.lastIndexOf("a"));//posição do indice do ultimo a



    }


}
