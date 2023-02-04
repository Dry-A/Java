package InterfaceDio;

public class Calculadora implements OperacaoMatematica {


    @Override
    public void somar(double x,double y){

        System.out.println("Soma "+(x+y));

    }

    @Override
    public void subtrair(double x,double y){

        System.out.println("Subtracao "+(x-y));

    }

    @Override
    public void divisao(double x,double y){

        System.out.println("Divisao "+(x/y));

    }


    @Override
    public void multiplicacao(double x,double y){

        System.out.println("Multiplicaçao "+(x*y));

    }

}
