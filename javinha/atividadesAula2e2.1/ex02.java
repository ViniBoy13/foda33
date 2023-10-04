import java.util.Scanner;
public class ex02 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um número");
            int n = scan.nextInt();
            if (n%2==0){
                System.out.println("O número é par!");
            }
            else{
                System.out.print("O número é ímpar!");
            }
        }
    }
}
