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

    public List<Aula> getAulas(){
        //adicionando metodo APENAS LEITURA:
        return Collections.unmodifiableList(aulas);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula){//assim tem que instanciar new Aula

        this.aulas.add(aula);
    }

}
