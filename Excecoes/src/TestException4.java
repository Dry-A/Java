package excecoes;

public class TestException4 {

    public static void main(String[] args) {


        try{

            int val = 10/0;

            System.out.println(val);

        }catch (Exception hehehe) {

            throw new DivisaoPorZeroException();

        }

    }
}
