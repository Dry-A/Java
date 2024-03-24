package condicionais;

import org.w3c.dom.ls.LSOutput;

public class Boolean {
    public static void main(String[] args) {


        int soma = 300;
        boolean resultado = soma > 150;
        int idade = 12;
        double salario  = 2400;
        double valor = soma > 200 ? 100 : 0;
        double nivelGlicose = 9;

        String maiorIdade = idade > 18 ? "Pode dirigir " : " Ainda nao pode dirigir ";

        String bolsaFamilia = salario < 2800 ? "Apto para Receber bolsa Familia " : "Renda acima ";

        String receitarOzempik = nivelGlicose > 90 ? "Ozempik 1mg por 2 meses" : "Esta9 indo muito bem";


        System.out.println(resultado);
        System.out.println(maiorIdade);
        System.out.println(valor);
        System.out.println(bolsaFamilia);
        System.out.println(receitarOzempik);
    }
}
