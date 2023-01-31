package Bomba;

public class BombaCombustivel {

   private String tipoCombustivel;
   private double valorLitro;
   private double qtddCombustivel;



    public void abastecerPorLitro(){

        double totalPagar = this.qtddCombustivel*this.valorLitro ;
        System.out.println("O total a pagar por "+ qtddCombustivel+ " litros de "+this.tipoCombustivel+" é de "+totalPagar);

    }


   public void abastecerPorValor(double valor){

       qtddCombustivel = valor/valorLitro;
       System.out.println("Você está levando "+qtddCombustivel+ " litros de "+ this.tipoCombustivel);

   }


    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public double getQtddCombustivel() {
        return qtddCombustivel;
    }

    public void setQtddCombustivel(double qtddCombustivel) {
        this.qtddCombustivel = qtddCombustivel;
    }
}
