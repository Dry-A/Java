package string;

public class FuncoesString {
    public static void main(String[] args) {

        String original = "abc dEF ghi jkl MNoa pQR astu abc ";

        String novo = original.toLowerCase();//todas minúsculas
        String novo2 = original.toUpperCase();//todas maiúsculas
        String novo3 = original.trim();//tira os espaços no final e no inicio
        String novo4 = original.substring(5);//do caracter 5 em diante
        String novo5 = original.substring(3,10); //do caracter 5 em diante
        String novo6 = original.replace('h','x'); //do caracter 5 em diante
        String novo7 = original.replace("abc","batatinha");//substitui
        int novo8 = original.indexOf("bc") ;//mostra o primeiro indice
        int novo9 = original.lastIndexOf("bc");//mostra a ultima posição em que bc apareceu

        System.out.println("original = *"+original+"*");
        System.out.println("toLowerCase = *"+novo+"*");
        System.out.println("toUpperCase = *"+novo2+"*");
        System.out.println("trim = *"+novo3+"*");
        System.out.println("substring = *"+novo4+"*");
        System.out.println("substring = *"+novo5+"*");
        System.out.println("replace = *"+novo6+"*");
        System.out.println("replace string = *"+novo7+"*");
        System.out.println("indexOf = *"+novo8 +"*");
        System.out.println("lastindexOf = *"+novo9 +"*");




    }
}
