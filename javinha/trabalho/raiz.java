/*Nome: Vinícius Rotter
Email: rottervini@gmail.com*/
package trabalho;

import java.util.Scanner;

public class raiz {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um número para saber sua raiz: ");
            int num = scan.nextInt(); 
            int result = num*num;
            System.out.println("A raíz quadrada é: " +result);
        }
    }
}
