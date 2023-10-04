import java.util.Scanner;
public class ex07 {

    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Selecione o seu time:");
            System.out.println("------------------");
            System.out.println("1-Grêmio.");
            System.out.println("2-Internacional");
            System.out.println("3-Flamengo");
            System.out.println("4-Palmeiras");

            int time_User = scan.nextInt();
            String escolha = null;
            switch (time_User){
                case 1:
                    escolha = "Grêmio";
                    break;
                case 2:
                    escolha = "Internacional";
                    break;
                case 3:
                    escolha = "Flamengo";
                    break;
                case 4:
                    escolha = "Palmeiras";
                    break;

            }
            System.out.println("Seu time é " +escolha);
        }

    }
}
