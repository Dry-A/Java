package string;
public class VetorComString {

    public static void main(String[] args) {


        String[] vetor = new String[]{"java", "html", "javascript"};


        String java = new String("java");

        String html = new String("HTML");

        String javascript = new String("Java");


        System.out.print(vetor[0] == java);

        System.out.print(" " + vetor[1].equalsIgnoreCase(html) + " ");

        System.out.print(vetor[2].startsWith(javascript));


    }

    }
