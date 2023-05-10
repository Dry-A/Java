package estruturaRepeticaoArraysStringColecoes;

public class TestaArrays {

    public static void main(String[] args) {

        float[] valores = new float[5];

        valores[0] = 10;
        valores[1] = 20;
        valores[2] = 30;
        valores[3] = 40;
        valores[4] = 50;

        System.out.println(valores[2]);

        Produto[] produtos = new Produto[2];

        Produto prod1 = new Produto();
        prod1.setNome("Manga");
        prod1.setDescricao("Palmer");
        prod1.setValor(10);

        Produto prod2 = new Produto();
        prod2.setValor(5);
        prod2.setNome("Banana");
        prod2.setDescricao("Prata");

        produtos[0] = prod1;
        produtos[1]= prod2;

        for (int i = 0; i < produtos.length ; i++) {

            System.out.println(produtos[i].toString());
        }

    //para array de objetos podemos usar o for each
//para cada variavel de nome prod do tipo Produto no array produtos, faça o que esta no escopo
        for (Produto prod   :produtos   ) {
//imprima com o ometodo sobrecarregado(override) toString
            System.out.println(prod.toString());
        }

        //10 corredores com 3 prateleiras cada

        Produto[][] localizacaoProduto = new Produto[10][3];

        localizacaoProduto[0][1] = prod1;
        localizacaoProduto[1][1]= prod2;

        System.out.println(localizacaoProduto[0][1].getNome());




    }
}
