package Enum2;

public enum Prioridade { //é uma classe

    MIN(1), NORMAL(5), MAX(10), NEMTANTO(7);
    //0,1,2,3 - ordem que eles estão, o primeiro é o 0

    //são classes, podem ter metodos e atributos

    //Para personalizar cada objeto, usa-se o Construtor:

    private int valor; // atributo

    Prioridade(int valor){    //construtor
        this.valor =valor;

    }

    public int getValor() {
        return this.valor;


        /*Definir constantes ou estados:
        *
        * botão ligado e desligado
        * estaçoes do ano, não mudam
        * status de um pedido
        * Estados Brasileiros*/
    }
}
