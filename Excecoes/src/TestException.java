package excecoes;

public class TestException {
    public static void main(String[] args) {

        try {

            //trecho onde a exceção pode ocorrer

            int val = 10/0;
            System.out.println(val);

        }catch (Exception hehehehe ) { //captura da exceção

            //tratamento da excecao
            hehehehe.printStackTrace();

        }

        /*Em java , uma exceção é um objeto do tipo exception, classificados em
        checked (obrido a tratar)  , unchecked e error (erro que nao pode ser tratado)
         */



    }
}
