package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("Senhor dos Anéis - A sociedade do Anel");
        livros.addFirst("A orfã");
        livros.add("O Poder do hábito");
        livros.push("O pequeno príncipe");
        livros.addLast("Pense e enriqueça");
        livros.push("A bíblia Sagrada");
        livros.push("O segredo");
        for (String livro: livros
        ) {
            System.out.println(livro);
        }
        livros.remove("A orfã");
        livros.pop(); // retirou o ultimo push

        System.out.println("Sem a orfã");

        for (String livro: livros
        ) {
            System.out.println(livro);
        }
        System.out.println("usando o peek");
        System.out.println(livros.peek()); //pega o topo

        System.out.println(livros.size());
        livros.clear();
        System.out.println(livros.contains("o senhor dos aneis"));
        System.out.println(livros.isEmpty());
    }
}