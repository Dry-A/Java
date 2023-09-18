package banco;

public class Cliente {

    private String nome;

    public Cliente(){};
    public Cliente(String nome){};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "banco.Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
