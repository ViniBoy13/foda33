package aula3Array;
import java.util.Scanner;
public class ex04array {
    //procura o elemento escolhido pelo usuário no laço de repetição e retorna false or true.(se existe ou não)
    static boolean procurar(int nescolhido, int[] elementos){
        for(int i=0; i<elementos.length; i++){
            if(elementos[i]== nescolhido){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        //definir os elementos fornecidos:
        int[] elementos = {41,23,24,45,67,9,7,8,1,3,4,12,16,6,2};

        //mostrar todos os elementos para o user:
        for(int allelements: elementos){
            System.out.println("Valores disponíveis: " +allelements);
        }
        try (//escolher um elemento do array:
        Scanner scan = new Scanner(System.in)) {
            System.out.println("Escolha um número visto acima:");
            int nescolhido = scan.nextInt();

            if(procurar(nescolhido, elementos)==true){
            System.out.println("O elemento escolhido é: " +nescolhido);
            }
            else{
            System.out.println("O elemento não existe!");
            }
        }
        }
        
       }
    
