package arraylist2;
import java.util.ArrayList;
import java.util.Scanner;
public class numbersten {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            ArrayList<Integer> num = new ArrayList<Integer>(10); 
            System.out.println("Digite 10 números: ");
            //fazer uma escolha dentro de um laço de repetição:
            for (int i=0; i<10; i++){
                int escolha = scan.nextInt();
                num.add( escolha);
                
                    
                }
                System.out.println("Números: " );
                for(int numeros: num){
                    System.out.println(numeros);
                }
                
                        
   }
        
        }
    
    

    }

