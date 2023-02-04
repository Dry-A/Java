package Bancofiap;

public class Teste {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();

        cc.setAgencia(1252);
        cc.setTipo("Pessoa física");
        cc.setNumero(5622);
        cc.setChequeEspecial(5000.0);

        Conta cc2 = new ContaCorrente();

        cc2.setAgencia(125);
        cc2.setNumero(2562);
        //nao acessa os atributos da ContaCorrente;
        cc2.depositar(1000);
        cc2.retirar(100);

        cc.depositar(2000);
        cc.retirar(100);

        Conta comum = new Conta();
        comum.depositar(1000);
        comum.retirar(100);

        System.out.println(cc.getSaldo());
        System.out.println(cc2.getSaldo());
        System.out.println(comum.getSaldo());



    }
}
