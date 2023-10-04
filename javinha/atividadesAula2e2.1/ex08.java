import java.util.Scanner;
public class ex08 {

    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o seu salário:");
            double sal = scan.nextDouble();
            double nw_sal = ((sal*0.01)+sal);
            System.out.println("O salário com reajuste é "+nw_sal);
        }
    }
}
