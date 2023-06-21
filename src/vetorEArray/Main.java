import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Array é um objeto, estático, homogeneo e indexado");

        double[] a = new double[6];

        a[2] = 10;

        System.out.println(a[2]);
        System.out.println(" como double é um tipo primitivo não da pra gente usar o . . Se o Array fosse de alguma classe aí daria");


        Integer[] o = new Integer[3];
        o[2] = 15;
        o[1] = 20;
        System.out.println(o[2].compareTo(o[1]));

        double[] minhasNotas = new double[4];

        System.out.println(Arrays.toString(minhasNotas));

        minhasNotas[0] = 7.0;
        minhasNotas[1] = 8.0;
        minhasNotas[2] = 7.0;
        minhasNotas[3] = 10.0;

        System.out.println(Arrays.toString(minhasNotas));

        double total = 0;
        //percorrendo o Array
        for (int i = 0; i < minhasNotas.length; i++) {
            System.out.println(minhasNotas[i]);
            total += minhasNotas[i];

        }

        double resultado;
        System.out.println(resultado = total / minhasNotas.length);
        if (resultado >= 7.0) {
            System.out.println("Passei");
        } else {
            System.out.println("deu ruim ");
        }

        String[] sobrinhos = new String[3];

        sobrinhos[0] = "Douglas";
        sobrinhos[1] = "David";
        sobrinhos[2] = "Beatriz";

        System.out.println(Arrays.toString(sobrinhos));

        for (int i = 0; i < sobrinhos.length; i++) {
            System.out.println(sobrinhos[i]);

        }

        //outra forma de inicializar: valores literais
        double[] notasIsa = {7.0, 5.0, 8.9, 6.8};

        System.out.println(" notas da Isa: ");

        for (int i = 0; i < notasIsa.length; i++) {
            System.out.println(notasIsa[i]);
        }

        //pegando a ultima nota
        System.out.println(minhasNotas[minhasNotas.length-1]);

        System.out.println("***** foreach ********");
        for (double nota: minhasNotas
             ) {

            System.out.println(nota);

        }

        }


    }

