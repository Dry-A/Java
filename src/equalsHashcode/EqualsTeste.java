package equalsHashcode;

import java.util.Date;

public class EqualsTeste {

    public static void main(String[] args) {


        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        u1.nome = "Daniel Loreto";
        u1.email = "daniel@gmail.com";

        u2.nome = "Daniel Loreto";
        u2.email = "daniel@gmail.com";


        System.out.println(u1 == u2);
        System.out.println(u1 == u1);
        System.out.println(u1.equals(u2)); //dara false pois equals é igual a p1 == p2(endereço na memoria) e isso é falso
        System.out.println(u2.equals(u1));
        System.out.println(u2.equals(u2));

        System.out.println(u2.equals(new Date()));


    }

}
