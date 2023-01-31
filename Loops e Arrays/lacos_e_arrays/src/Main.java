import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);


        int idade;
        String nome;


        while(true){

            System.out.println("Nome: ");
            nome = leia.next();
            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = leia.nextInt();
        }


        System.out.println("saí");

    }
}