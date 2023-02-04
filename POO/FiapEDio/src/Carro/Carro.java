package Carro;

public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;


    public Carro(){

    }

    public Carro(String cor, String modelo, int capacidadeTanque){

        this.modelo=modelo;
        this.cor = cor;
        this.capacidadeTanque=capacidadeTanque;

    }

    public double totalValorTanque(double valorCombustivel){

        double resultado = valorCombustivel*this.capacidadeTanque;
        return resultado;

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

}
