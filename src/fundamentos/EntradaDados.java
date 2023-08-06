package fundamentos;

import javax.swing.*;

public class EntradaDados {
    public static void main(String[] args) {
        // entrada de dados via JoptionPane
        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa: "));
        System.out.println("A pessoa tem " + idade + " anos de idade.");

    }
}
