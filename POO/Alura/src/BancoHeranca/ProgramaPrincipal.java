package BancoHeranca;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        ContaCorrente cc1 =new ContaCorrente(1110,25632);

        cc1.deposita(856.6);


        ContaPoupanca cp1 = new ContaPoupanca(222,2563);

        cp1.deposita(2000);

        cc1.transfere(200,cp1);


        System.out.println(cp1.toString());

        System.out.println(cc1.toString());







    }
}
