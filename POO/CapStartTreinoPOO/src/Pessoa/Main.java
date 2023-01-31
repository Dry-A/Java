package Pessoa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Pessoa p1 = new Pessoa();

        p1.setNome("Jeorge Nascimento");
        p1.setAltura(1.89f);
        p1.setDataNascimento("25/05/2000");


        System.out.println(p1.toString());

        Pessoa p2 = new Pessoa();

        p2.setNome("Vania lacerda");
        p2.setAltura(1.65f);
        p2.setDataNascimento("5/6/1956");


        System.out.println(p2.toString());



    }
}