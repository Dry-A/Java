package Enum1;

public class SistemaIbge {
    public static void main(String[] args) {


        //para imprimir os Estados existentes no enum

        for (EstadosBrasileiros uf : EstadosBrasileiros.values()) {

            System.out.println(uf.getSigla()+" - "+ uf.getNomeMaiusculo() );

            //selecionando um estado a partir das opções disponíveis
            EstadosBrasileiros ufSelecionado = EstadosBrasileiros.SAO_PAULO ;


            System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
        }


    }
}
