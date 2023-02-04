package Empresa;
public class Programador extends Funcionario  {

    String nivel;


    @Override
    void metodo1(){

        System.out.println("Método 1 da classe filha Programador ");
    }

    @Override
    void metodo2(){
        System.out.println("Método 2 da classe filha Programador");
    }



    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
