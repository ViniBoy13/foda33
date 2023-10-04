import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite sua idade:");
            int idade = scan.nextInt();
            if (idade>=16){
                System.out.println("Você ja pode votar.");
            }
            else{
                System.out.println("Você não pode votar.");
            }
        }
    }
}
