package banco;

public class TesteConta {
    public static void main(String[] args) {

        System.out.println("Hello world!");


      ContaEspecial opa = new ContaEspecial(234, 6000);

      opa.deposita(3000);

        System.out.println(opa.getSaldo());
        System.out.println(opa.getLimiteCredito());

        System.out.println(opa.saca(8000));
        System.out.println(opa.saca(10000));
        System.out.println(opa.saca(9000));





    }
}