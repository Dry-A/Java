package excecoes;

public class TesteException5 {

    public static void main(String[] args) throws DivisaoPorZeroNova { //porque heda de Exception


        try {

            int val = 10 / 0;

            System.out.println(val);

        } catch (Exception hehehe) {

            throw new DivisaoPorZeroNova();


        }
    }

}
