package estruturaRepeticaoArraysStringColecoes;

public class UsandoStrings {
    public static void main(String[] args) {


        String nome;
        nome = new String();
        nome = "Pêra";
        int valor = 10;

        System.out.println(nome);

        String nome2 = new String("Pêra");
        System.out.println(nome2);

        String nome3 = "Pêra"; //cria somente um pull
        System.out.println(nome3);

        /*String nome4=null;
        System.out.println(nome4.length());//erro em tempo de execução*/

        String descricao = "Tipo Williams \nA mais suculenta do mercado";
        System.out.println(descricao);

        descricao = "Tipo Williams \tA mais doce do mercado";
        System.out.println(descricao);

        descricao= "Tipo Williams \"A mais doce do mercado\"";
        System.out.println(descricao);

        descricao = "Tipo Williams, a pera mais doce do mundo";


        String propaganda = nome + " "+ descricao;
        System.out.println(propaganda);

        propaganda = nome.concat(" ").concat(descricao);
        System.out.println(propaganda);

        propaganda += "?";
        System.out.println(propaganda);

        propaganda += valor;
        System.out.println(propaganda);




    }
}
