package Empresa;

public class Funcionario {

    private String nome;
    private String sobrenome;

    private int idade;

    private char sexo;

    public Funcionario(){}

    public Funcionario(String nome){

        this.nome = nome;
    }

    void metodo1(){
        System.out.println("Oie, primeiro metodo da classe mae");
    }

    void metodo2(){
        System.out.println("Agora método 2 da classe mae");
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }
}
