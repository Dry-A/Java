package estruturaRepeticaoArraysStringColecoes;

public class SubLowerUpper {
    public static void main(String[] args) {

        String descricao = new String("Pera Williams, a pera mais doce do mercado!");

        System.out.println(descricao.toLowerCase()); //todos caracteres em minusculo
        System.out.println(descricao.toUpperCase()); // todos caracteres em maiusculo
        System.out.println(descricao.substring(0, 4)); //busca de caracteres começando do indice 0 ate o indice 4
        System.out.println(descricao.substring(4)); //do indice 4 ate o fim
        System.out.println(descricao.substring(
                descricao.indexOf("Pera"),//inicio
                descricao.indexOf(" ")//fim
        ));

        System.out.println(descricao);

    }

}
