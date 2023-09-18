package banco;

public class ContaCorrente {


    private int agencia = 1;
    private int numero;
    private Cliente titular;
    private float saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, float saldo, Cliente titular) {

    }

    public ContaCorrente(String numero) {
    }

    public void deposita(float valor) {

        this.saldo += valor;
        System.out.println("Acabei de depositar " + saldo);
    }

    public boolean saca(float valor) {
        if (this.saldo >= valor) {

            this.saldo -= valor;

            return true;

        } else {
            return false;
        }
    }

    public boolean transfere(ContaCorrente contaDestino, float valor) {


        if (this.saca(valor)) {
            contaDestino.deposita(valor);

            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }


    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
