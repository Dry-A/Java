package Enum1;

public enum EstadosBrasileiros {

    SAO_PAULO("SP", "São Paulo"),
    MINAS_GERAIS("MG", "Minas Gerais"),
    RIO_GRANDE_DO_SUL("RS","Rio Grande do Sul"),
    ESPIRITO_SANTO("ES", "Espírito Santo");

    private String sigla;

    private String nome;

    private EstadosBrasileiros(String sigla, String nome){//construtor privado
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }

}
