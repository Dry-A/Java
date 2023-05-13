package excecoes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TesteException3 {

    public static void main(String[] args) throws IOException {

        FileWriter bananinha = new FileWriter("c?\\nota.txt");

        PrintWriter print = new PrintWriter(bananinha);
        print.println("Pera = R$ 6,00");
        print.println("Uva itália = R$ 10,00");
        print.println("Total = R$ 16,00");
        print.close();
        bananinha.close();


    }

}
