package aula3Array;
import java.util.Scanner;
public class ex12array {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            float euros = 5.564f;
            float dolar = 4.9167f;
            float real = 1.0f;
            System.out.println("Digite um valor em reais para converter: ");
            float valorreal = scan.nextFloat();
            float valorparaeuro = valorreal*(real/euros);
            float valorparadolar = valorreal*(real/dolar);
            System.out.println("O valor em euro é: " +valorparaeuro+" e o valor em dólar é: " +valorparadolar);
            
            System.out.println("-------------------------------------------------------------------------------");

            float conta_cliente_reais = 30.0f * euros;
            System.out.println("O valor da conta em reais é: " +conta_cliente_reais);
            System.out.println("-------------------------------------------------------------------------------");
            float conta_celular_reais = 1200.0f * dolar;
            System.out.println("O valor do celular em reais é: " +conta_celular_reais);
        
        }

    }
}
