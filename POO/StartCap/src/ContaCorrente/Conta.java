package ContaCorrente;

public class Conta {

    private int numero;

    private float saldo;

    Titular titular;


    public Conta(int numero, Titular titular){

        this.numero = numero;
        this.titular = titular;

        System.out.println("Criando uma conta");


    }


    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", titular=" + titular.getNome() +
                '}';
    }


    public void deposita(float valor){
        this.saldo += valor;

    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;




    }
}
