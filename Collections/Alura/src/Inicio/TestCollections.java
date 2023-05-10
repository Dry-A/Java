package collections;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {

        ArrayList carrinho = new ArrayList<>();

        Double valor = 100.70;
        int valor2 = 202;
        int valor3;

        carrinho.add(valor); //indice 0
        carrinho.add("Uva"); //indice 1
        carrinho.add(valor2); // indice 2

        System.out.println(carrinho.get(0)); //get -> pega o valor que ta no indice em parenteses

        //Interface List e uso de Generics
        //Generics nao permite tipos primitivos

        List<String> marca = new ArrayList<String>();

        System.out.println(marca.isEmpty());

        marca.add("Mcdonalds");
        marca.add("Nestlé");
        marca.add("Hering");
        marca.set(2,"Lacta");

        System.out.println(marca.isEmpty());
        System.out.println(marca.size());

        marca.add("Cacau Show");
        marca.add("Dudalina");

        System.out.println(marca.size());

        //sem generics precisamos de um cast
        System.out.println("----------- List --------------");
        List<String> fruta = new ArrayList<String>(); //permitem itens repetidos

        fruta.add("Bana Prata");
        fruta.add("Maça Gala");
        fruta.add("Manga Ourinho");
        fruta.add("Banana Prata");



        System.out.println(fruta.contains("Banana Prata"));
        System.out.println(fruta.indexOf("Banana Prata")); // posição que esta no array list
        System.out.println(fruta.get(fruta.indexOf("Banana Prata")));
        System.out.println(fruta.lastIndexOf("Banana Prata")); //qual a ultima ocorrencia dentro do arraylist
        System.out.println(fruta);

        System.out.println("------------- Set ---------");
        Set<String> cesta = new HashSet<String>();//coloca em ordem - nao permite itens  repetidos

        System.out.println(cesta.isEmpty());
        cesta.add("Tônico");
        cesta.add("Água Micelar");
        cesta.add("Finalizador");

        System.out.println(cesta.isEmpty());

        System.out.println(cesta.size());
        System.out.println(cesta);;

        System.out.println("******** map *****");

        Map<String, String> caixa =new HashMap<String, String>(); //chave: valor
        //


        caixa.put("012h5","Cleber");
        caixa.put("854h1","Aristoteles");
        caixa.put("A452G","Ferdinando");
        caixa.put("k4585","Santinha");

        System.out.println(caixa.isEmpty());
        System.out.println(caixa.size());
        System.out.println(caixa.containsKey("012h5"));
        System.out.println(caixa.containsValue("Ferdinando"));
        System.out.println(caixa);











    }
}
