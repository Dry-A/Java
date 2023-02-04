package Exercicios;

public class RegistroProdutoCom3Loops {
    public static void main(String[] args) {


        int qtdProdutos = 5;
        int registro = 0;

        /*while (registro < qtdProdutos){

            registro++;
            System.out.println("Produto número "+registro+" foi registrado");
        }*/


        /*do{
            registro++;
            System.out.println("Produto número "+registro+" foi registrado");


        }while(registro<qtdProdutos);*/

        /*o while faz a checagem antes que a primeira linha do trecho de código
        seja executada, while e do while deve ser usado quando nao sabemos exatamente qtas vezes*/


        for (int i = 0 ;i<qtdProdutos ;i++){

            System.out.println("Produto número "+i+" foi registrado");


        }



    }
}
