package Bomba;

import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {


        BombaCombustivel cl1 = new BombaCombustivel();

        cl1.setQtddCombustivel(45);
        cl1.setValorLitro(4.98);
        cl1.setTipoCombustivel("gasolina");

        cl1.abastecerPorLitro();



        cl1.setTipoCombustivel("alcool");
        cl1.setValorLitro(3.98);

        cl1.abastecerPorValor(200.0);




    }
}
