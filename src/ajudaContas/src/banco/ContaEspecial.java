package banco;

public class ContaEspecial extends ContaCorrente {


        private double limiteCredito;

        public ContaEspecial(int numero, double limiteCredito) {
            super(String.valueOf(numero));
            this.limiteCredito = limiteCredito;
        }

        @Override
        public boolean saca(float valor) {
            
           float saldoTotal = (float) (getSaldo() + limiteCredito);

            if (saldoTotal >= valor) {

                if (getSaldo() >= valor) {

                    float saldo = valor;


                } else {
                    double valorSacadoDoLimite = valor - getSaldo();
                    setSaldo(0);
                    limiteCredito -= valorSacadoDoLimite;
                }
                return true;


            } else {
                System.out.println("Limite de crédito insuficiente.");
                return false;
            }
        }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}

