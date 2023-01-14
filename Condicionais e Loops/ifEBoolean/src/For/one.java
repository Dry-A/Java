package For;

public class one {
    public static void main(String[] args) {

        //conta de 0 a 100

        for(int contador =0;contador <=100; contador=contador+5){
            System.out.println(contador);
        }
        /*lógica do for: primeira parte só é executada uma vez, em seguida parte do meio - é verdade????
         então entra no escopo, e só depois disso vai para a terceira parte. E volta para a parte do meio , depois vai para o
          escopo, e em seguida para a ultima parte*/
        //o contador só funciona dentro do escopo do for, fora disso a variável termina seu ciclo.
    }
}
