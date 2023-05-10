package estruturaRepeticaoArraysStringColecoes;

public class MetodosStrings {
    public static void main(String[] args) {

        String fruta = new String("maça");
        String fruta2 = new String("Maça");
        String fruta3 = new String("maça");

        //comparar essas strings - equals e equalsIgnorecase

        System.out.println(fruta.equals(fruta2) );//false

        System.out.println(fruta.equalsIgnoreCase(fruta2)); //true

        System.out.println(fruta.equals(fruta3)); //true

        boolean teste = (fruta == fruta3);
        /* o operador  ==  compara a posição delas na memoria,pois
        foram instanciadas,na linha 7,8 e 9  por isso é falso*/

        System.out.println(teste);

        String fruta4 = "maça";
        String fruta5 = "maça";
        /* não foram instanciadas, entao o java utilizará somente um pull de memoria
         para armazenar os 2 valores e ambas estao no mesmo endereço de memoria */

        teste = (fruta4 == fruta5);

        System.out.println(teste);

    }

}
