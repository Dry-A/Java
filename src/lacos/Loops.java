package lacos;

public class Loops {
    public static void main(String[] args) {


        int qtdProdutos = 6;
        int registro = 0;

       /* while (registro<qtdProdutos){

            registro++;
            System.out.println("O produto numero "+registro+" foi registrado");

        }

        do {
            registro++;
            System.out.println("O produto numero "+registro+" foi registrado");

        }while (registro<qtdProdutos);*/

        for (int i = 0; i <= qtdProdutos; i++) {

            System.out.println("O produto numero " + i + " foi registrado");
        }

        int filhos = 4;
        int vacinados = 0;

        for(int i = 0; i<filhos; i++){
            System.out.println( "Filho "+ i + " foi vacinado");
        }
    }
}