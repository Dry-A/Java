package excecoes;

public class TestException2 {

    public static void main(String[] args) {

        try {

            //trecho onde a exceção pode ocorrer
            int val = 10 / 0;

            int[] valores = new int[3];
            System.out.println(valores[4]);

            String nome = null;
            System.out.println(nome.length());

            int numero = Integer.parseInt("zero");

       /* } catch (ArithmeticException hahaha) { //captura da exceção


            System.out.println("Não é possivel realizar uma divisao por zero");

            //mensagem com a LISTA DE ERROS
            System.out.println(hahaha.getMessage());

            //Imprime a pilha de erro da exceçãp
            hahaha.printStackTrace();*/

        } catch (ArrayIndexOutOfBoundsException hihihi) {

            System.out.println("Não é possivel acessar a posição 4 do Array!");

        } catch (NullPointerException hohoho) {

            System.out.println("Não foi possivel retornar o length, variavel NOME nao inicializada / instanciada");

        } catch (NumberFormatException huhuhu) {

            System.out.println("Nao foi possivel realizar a conversão.");

        } catch (Exception rsrsrs) {

            System.out.println("Erro na execução do programa! ");
        }


    }
}