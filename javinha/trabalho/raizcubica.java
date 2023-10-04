/*Nome: Vinícius Rotter
Email: rottervini@gmail.com*/
package trabalho;

import java.util.Scanner;

public class raizcubica {
    public static void main(String args[]){
    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Digite um número: " );
        int num = scan.nextInt();
        int result = num*num*num;
        System.out.println("A raíz cúbica é: " +result);
    }

    }
}
