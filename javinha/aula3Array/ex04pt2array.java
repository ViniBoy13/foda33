package aula3Array;
import java.util.*;
public class ex04pt2array {
    public static void main(String[] args){
        //definir os elementos fornecidos:
        int[] elementos = {41,23,24,45,67,9,7,8,1,3,4,12,16,6,2};

        //mostrar todos os elementos para o user:
        for(int allelements: elementos){
            System.out.println("Valores disponíveis: " +allelements);
        }
        //escolher um elemento do array:
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Escolha um número visto acima:");
            int nescolhido = scan.nextInt();
        //procurar o valor no array:
        //iniciar a variável como -1 para busca de dados
        int position = -1;
        for(int i=0; i<elementos.length; i++){
            if(elementos[i]==nescolhido){
                position=i;
            }
        //mostrar a posição:
        //(!=) serve para dizer: "Não é igual a:" ou seja SE position Não for igual à -1:
        if(position !=-1){
            System.out.println("O valor " +nescolhido+ " está na posição: " +position+ " do array.");
        }
        else{
            System.out.println("O elemento não existe.");
        }
        }
        }
        
    }
}
