package vetorEArray;

public class Guanabara1 {
    public static void main(String[] args) {


       /* String mes[] = new String[4];

        //mes[0] = "março";
        //mes[1] = "abril";
        //mes[2] = "janeiro";
        //mes[3] = "maio";
        //mes[4] = "agosto";
        //mes[5] = "novembro"; */

        //ou simplesmente:

        // String mes[] = {"março","abril","janeiro","maio","agosto","novembro" };


        int n[] = {12, 30, 26, 26, 8};

        System.out.println("Total de casas de N: " + n.length);

        //mostrar o vetor na tela - uma das opçoes: for

            /*for( int c=0;c<=4;c++ ){

                System.out.println("Na posição "+c+ "tenho o valor " + n[c]+" ");


            }*/

        for (int c = 0; c <= n.length - 1; c++) {

            System.out.println("Na posição " + c + "tenho o valor " + n[c] + " ");

        }

    }
}
