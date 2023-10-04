import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite a primeira nota do aluno: ");
            int n1 = scan.nextInt();
            System.out.println("Digite a segunda nota do aluno: ");
            int n2 = scan.nextInt();
            System.out.println("Digite a terceira nota do aluno: ");
            int n3 = scan.nextInt();
            System.out.println("Digite a quarta nota do aluno: ");
            int n4 = scan.nextInt();

            int media = ((n1 + n2 + n3 + n4) / 4);
            System.out.println("A média das notas é: " + media);
            //EX04//
            if (media >= 7) {
                System.out.println("Aluno aprovado!");
            }
            else{
                System.out.println("Aluno reprovado!");
            }
        }

    }
}
