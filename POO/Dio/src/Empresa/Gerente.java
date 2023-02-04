package Empresa;

public class Gerente extends Funcionario {

    private int nivel;

    @Override
    void metodo1(){

        System.out.println("Método 1 da classe filha Gerente ");
    }

    @Override
    void metodo2(){
        System.out.println("Método 2 da classe filha Gerente");
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}