package ContaCorrente;

public class Main {
    public static void main(String[] args) {

        /*Conta c1 = new Conta();

        Titular t1 = new Titular();

        t1.setNome("Cristóvão Fernando de Assis");

        c1.setNumero(15232);
        c1.setTitular(t1);
        c1.setSaldo(5623.0f);

        System.out.println(c1.getNumero());
        System.out.println(c1.getTitular().getNome());
        System.out.println(c1.getSaldo());

        c1.deposita(5000.0f);

        c1.saca(10000.0f);

        System.out.println( c1.getSaldo());*/

        Titular t4 = new Titular();
        t4.setNome("Francisco");

      Conta conta = new Conta(15235, t4);


        System.out.println(conta.getTitular().getNome());

        System.out.println( conta.toString());

        conta.deposita(50000.0f);
        System.out.println(conta.getSaldo());







    }
}
