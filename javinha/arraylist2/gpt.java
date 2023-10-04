package arraylist2;
import java.util.ArrayList;
import java.util.Scanner;

public class gpt {
    private ArrayList<Integer> numbers;

    public gpt() {
        numbers = new ArrayList<>(10);
    }

    public void readNumbers() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite 10 números: ");
            for (int i = 0; i < 10; i++) {
                int escolha = scan.nextInt();
                numbers.add(escolha);
            }
        }
    }

    public void printNumbers() {
        System.out.println("Números escolhidos:");
        for (int numero : numbers) {
            System.out.println(numero);
        }
    }

    public static void main(String args[]) {
        gpt numberList = new gpt();
        numberList.readNumbers();
        numberList.printNumbers();
        
        // Exemplo de como acessar a escolha fora do loop
        if (!numberList.numbers.isEmpty()) {
            int primeiraEscolha = numberList.numbers.get(0);
            System.out.println("A primeira escolha foi: " + primeiraEscolha);
        }
    }
}
