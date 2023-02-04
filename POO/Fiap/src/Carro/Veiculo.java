package Carro;

public class Veiculo {



    private String cor;
    private String modelo;
    private String marca;

    private int anoFabricacao;

    private Long chassi;

    private Long renavam;


    public Veiculo(){

        System.out.println("Criando um veículo");

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public Long getChassi() {
        return chassi;
    }


    public Long getRenavam() {
        return renavam;
    }



    @Override
    public String toString() {
        return "Veiculo{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", chassi=" + chassi +
                ", renavam=" + renavam +
                '}';
    }
}
