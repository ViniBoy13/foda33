package aula3Array;
import java.util.*;
public class ex05array {
    public static void main(String[] args){
        int[] array = {9,4,32,213,8,16,15,27};
        //nota, array.length seria o comprimento do array, literalmente.
        int quantidade=array.length;
        System.out.println("A quantidade de elementos do array é: "+quantidade);
        //classificar o array para modo crescente:
        Arrays.sort(array);
        //mostrar o array:
        for(int ordem: array){
        System.out.println(+ordem);
        
        }
    }
}
