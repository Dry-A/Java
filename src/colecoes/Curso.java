package colecoes;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>(); //poderia ser collection em vez de Set

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

    public void matricula(Aluno aluno) {

        this.alunos.add(aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }
}
