package Enum2;

public class Teste {
    public static void main(String[] args) {


    Prioridade pMin = Prioridade.MIN;
    Prioridade pMax = Prioridade.MAX;
    Prioridade pNemTanto = Prioridade.NEMTANTO;


        System.out.println(pNemTanto.name());
        System.out.println(pMin.name());
        System.out.println(pMax.ordinal());
        System.out.println(pMin.ordinal());
        System.out.println(pNemTanto.ordinal());
        System.out.println(pNemTanto.getValor());











    }

}
