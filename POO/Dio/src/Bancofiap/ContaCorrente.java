package Bancofiap;

public class ContaCorrente extends Conta  {

    private String tipo;
    private double chequeEspecial;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;

    }

    public double getSaldoDisponivel(){

        return super.getSaldo() + chequeEspecial;
    }

    //sobreescrita
    @Override //subprogramação
    public void retirar(double valor){
        valor +=10;//10 é a taxa
        super.retirar(valor);

    }

}
