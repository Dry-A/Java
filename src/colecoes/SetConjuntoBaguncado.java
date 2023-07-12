package colecoes;

import java.util.HashSet;
import java.util.Set;

public class SetConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjuntinho = new HashSet();

        conjuntinho.add(1.2); // converte todas as classes primitivas em Wrapper, nesse caso Double
        conjuntinho.add(true);
        conjuntinho.add("testando testando...");
        conjuntinho.add(45);
        conjuntinho.add('m');
        conjuntinho.add("Madeleine");
        System.out.println("Tamanho do conjunto é " + conjuntinho.size());

        conjuntinho.add("Testando testando");
        conjuntinho.add('m'); //este sera ignorado
        System.out.println("Tamanho do conjunto é " + conjuntinho.size());

        conjuntinho.add("Brilha brilha estrelinha");
        conjuntinho.add('f');
        System.out.println("Tamanho do conjunto é " + conjuntinho.size());
        System.out.println(conjuntinho.contains('f'));

        conjuntinho.remove('f');
        conjuntinho.remove("Brilha brilha estrelinha");
        System.out.println("Tamanho do conjunto é " + conjuntinho.size());

        Set numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println("Conjunto Set Numeros: "+numeros);
        System.out.println("Conjuntinho: "+conjuntinho);

        conjuntinho.add(numeros);
        System.out.println("Conjuntinho depois de eu adicionar o conjunto Números a ele:  "+ conjuntinho);

        System.out.println("Tem o nome Madeleine no conjuntinho? "+ conjuntinho.contains("Madeleine"));

        System.out.println("------------------------- Treinando -----------------");

        HashSet mercado = new HashSet();

        mercado.add("Molho de tomate");
        mercado.add("Margarina");
        mercado.add("Pão de queijo");
        mercado.add("Danone natural");
        mercado.add("Lentilha");
        mercado.add("Sazon Vermelho");
        System.out.println("Conjunto mercado: "+ mercado);

        conjuntinho.add(mercado);
        System.out.println("Conjuntinho + mercado: "+conjuntinho);
        System.out.println("O conjunto mercado tem "+mercado.size()+" elementos.");
        System.out.println("que são:"+ mercado);
        System.out.println("usando o foreach agora: ");
 /*for (String itens: mercado
             ) {
            System.out.println(mercado);

        }*/
        System.out.println("O conjunto bagunçado tem "+conjuntinho.size()+" elementos. Que são os seguintes:\n "+conjuntinho);

        mercado.remove("Molho de tomate");
        System.out.println(mercado);
        System.out.println(mercado.contains("Pão de queijo"));

        Set senhas = new HashSet();
        senhas.add(260606);
        senhas.add(1205);
        senhas.add(813012);
        senhas.add(2);

        System.out.println("As senhas são:" +senhas);

        //conjuntinho.addAll(senhas);
        //System.out.println("O conjunto bagunçado, agora com o conjunto de senhas é " + conjuntinho);
        conjuntinho.retainAll(senhas);
        System.out.println(conjuntinho);
        senhas.remove(1205);
        System.out.println(senhas);

    }

}