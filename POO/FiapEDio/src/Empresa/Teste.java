package Empresa;

public class Teste {


    public static void main(String[] args) {

        Funcionario[] classes = new Funcionario[]{new Gerente(), new Programador(), new Funcionario() };


        for(Funcionario funcionario: classes){

            funcionario.metodo1();

        }
        System.out.println(" ");

        for (Funcionario funcionario: classes){

            funcionario.metodo2();
        }
        System.out.println(" ");

        Gerente gerente = new Gerente();
        gerente.metodo2();




    }
}
