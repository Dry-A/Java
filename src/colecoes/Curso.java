package colecoes;

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

    public List<Aula> getAulas(){
        return aulas;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula){

        this.aulas.add(aula);
    }
}
