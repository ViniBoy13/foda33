import java.util.*;

public class ex01 {
    public static void main(String[] args){

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um número:");
            float n = scan.nextFloat();
            System.out.println("Digite outro número");
            float n2 = scan.nextFloat();
            if (n > n2) {
                System.out.println("O número maior é " + n);
            }
            if (n2>n) {
                System.out.println("O número maior é" +n2);

            }
        }
    }

}