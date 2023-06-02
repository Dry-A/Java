package colecoes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        //adicionando metodo APENAS LEITURA: (forma defensiva)
        return Collections.unmodifiableList(aulas);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula) {//assim tem que instanciar new Aula

        this.aulas.add(aula);
    }

    public int getTempoTotal() {

       /* int tempoTotal = 0;
        for (Aula aula : aulas
        ) {
            tempoTotal += aula.getTempo();

        }*/
        //ou
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();

       // return tempoTotal;
    }

    @Override
    public String toString() {
        return "[Curso: "+ nome + "tempo total "+ this.getTempoTotal()+ " minutos. Aulas:" + this.aulas ;
    }
}
