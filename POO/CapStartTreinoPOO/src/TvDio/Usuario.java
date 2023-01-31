package TvDio;

public class Usuario {

    public static void main(String[] args) {



        Tv smartTv = new Tv();

        System.out.println(smartTv.getCanal());
        System.out.println(smartTv.getVolume() );
        System.out.println(smartTv.isLigada() );

        smartTv.ligar();
        smartTv.desligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();



    }
}
