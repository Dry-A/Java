package fundamentos;

import java.util.Scanner;

public class PaginasLivros {

    /*
     * Sua tia Gertrudes é uma leitora assídua. E ela gostaria de ter um aplicativo
     * que
     * dissesse para ela, de acordo com o número de páginas de um livro, quanto
     * tempo ela
     * levaria para ler lendo apenas 3 páginas por dia. Como você está aprendendo
     * Java,
     * você se disponibilizou para ajudá-la com esse desenvolvimento.
     */
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int paginas = leia.nextInt();

        int paginasLidasDia = 3;

        System.out.println(paginas / paginasLidasDia);

    }
}
