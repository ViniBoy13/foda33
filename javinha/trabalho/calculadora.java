/*Nome: Vinícius Rotter
Email: rottervini@gmail.com*/
package trabalho;
import java.util.Scanner;
public class calculadora {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("<Calculadora>");
        System.out.println("-------------");
        System.out.println("Digite um número: ");
        System.out.println("_________________");
        System.out.println("");
        double num1 = scan.nextDouble();
        System.out.println("_________________ ");
        System.out.println("");
        System.out.println("Digite o segundo número: ");
        System.out.println("________________________");
        System.out.println("");
        double num2 = scan.nextDouble();
        System.out.println("________________________");
        System.out.println("");
        System.out.println("Escolha a operação matemática:");
        System.out.println("-____________________________-");
        System.out.println("");
        System.out.println("1-Adição");
        System.out.println("-       ");
        System.out.println("2-Subtração");
        System.out.println("-          ");
        System.out.println("3-Multiplicação");
        System.out.println("-              ");
        System.out.println("4-Divisão");
        System.out.println("");
        System.out.println("-____________________________-");
        System.out.println("");
        System.out.println("Digite sua escolha: "); 
        System.out.println("___________________");
        System.out.println("");
        int escolha = scan.nextInt();
        System.out.println("___________________");
        double valor = 0.0;
        switch(escolha){
            case 1:
                valor = num1+num2;
                break;
            case 2:
                valor = num1-num2;
                break;
            case 3: 
                valor = num1*num2;
                break;
            case 4:
                valor = num1/num2;
                if(num2!=0){
                    valor = num1/num2;
                }
                else{
                    System.out.println("Erro, divisão por 0.");
                    System.exit(0);
                }
                break;
            default: 
            System.out.println("ERRO");
            System.exit(0);
        }
        System.out.println("");
        System.out.println("Resultado: " +valor);
        System.out.println("_______________");
        scan.close();
    }
}
