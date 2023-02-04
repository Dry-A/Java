package Carro;

public class RodarAplicação {

    public static void main(String[] args) {


        Carro carro = new Carro();

        carro.setCor("cinza");
        carro.setModelo("Kicks"); ;
        carro.setCapacidadeTanque(58);

        System.out.println(carro.getModelo());

        Carro carro2 = new Carro("preto","Kicks",58);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println("Tanque cheio R$ "+carro2.totalValorTanque(5.98));



     Veiculo moto = new Moto();
     moto.setCor("cinza");
     moto.setModelo("Kicks");
     moto.setMarca("Nissan");

        System.out.println(moto.toString());


    }

}
