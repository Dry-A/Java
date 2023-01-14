package While;

public class two {

    //Contar todos os numeros de 1 a 1000
    public static void main(String[] args) {

        int contador =0;
        int total=0;

        while(contador <=1000){

            total = total +contador;
            contador ++;
        }
        System.out.println("A soma de todos os números de 1 até 1000 é ="+total);
    }
}
