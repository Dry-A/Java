package TvDio;

public class Tv {

   private int canal=1;
   private int volume=20;
   private boolean ligada=false;


   public void ligar(){

       ligada=true;
       System.out.println("Tv ligou");
       }

    public void desligar(){

        ligada=false;
        System.out.println("Tv desligou");
    }


    public void aumentarVolume(){

       this.volume++;

        System.out.println("aumentei o volume para "+volume);
    }

    public void diminuirVolume(){

       this.volume--;

        System.out.println("diminui o volume "+ volume);
    }



    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}
