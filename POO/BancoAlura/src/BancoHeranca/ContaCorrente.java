package BancoHeranca;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero){

        super(agencia, numero);


    }

    //reescrever o metodo saca - palavra Override - sobreescrita


    @Override //anotacao
    public boolean saca(double valor) { //nao pode alterar visiblidade, tipo e nome
        return super.saca(valor);
    }
}
