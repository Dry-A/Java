package For;

public class linhaColuna {
    public static void main(String[] args) {


        for (int linha = 0; linha < 10; linha++) {

            for (int coluna = 0; coluna < 10; coluna++) {

                System.out.print("^ ");
            }
            System.out.println();
        }
        System.out.println();

        for (int linha = 0; linha < 10; linha++) {

            for (int coluna = 0; coluna <=linha; coluna++) {

                if(coluna >linha){
                    break;
                }
                System.out.print("^ ");
            }
            System.out.println();
        }

                for(int linha = 0; linha < 5; linha++) {
                    for (int coluna = 0; coluna < 5; coluna++) {
                        if ( coluna>linha) {
                            break;
                        }
                        System.out.print(coluna+1);
                    }
                    System.out.println();
                }
            }
        }


