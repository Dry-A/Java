package colecoes;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new LinkedHashSet<>(); //poderia ser collection em vez de Set
    private Map<Integer, Aluno> variavelMatriculaParaAluno = new HashMap<>();

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
        return "[Curso: " + nome + "tempo total " + this.getTempoTotal() + " minutos. Aulas:" + this.aulas;
    }

    public void matricula(Aluno aluno) {

        this.alunos.add(aluno);
        this.variavelMatriculaParaAluno.put(aluno.getNumeroMatricula(),aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    /*public Aluno buscaMatriculado(int numero) {

        for (Aluno aluno : alunos) {
            if (aluno.getNumeroMatricula() == numero)
                return aluno;
        }
        throw new NoSuchElementException("Matrícula não encontrada " + numero);
    }*/

//com Map
    public Aluno buscaMatriculado(int numero){

        if (!variavelMatriculaParaAluno.containsKey(numero))
            throw new NoSuchElementException();
        return variavelMatriculaParaAluno.get(numero);
    }
}

