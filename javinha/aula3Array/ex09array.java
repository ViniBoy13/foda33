package aula3Array;

public class ex09array {
   public static void main(String args[]){
    //declarando o vetor.
    int vet[] = {20,4,23,43,7,6,8,19};
    //declarando a variável para multiplicar.
    int doublev=0;
    //laço de repetição com todos os elementos do array
    for(int i=0; i<vet.length; i++){
        //variável(doublev) = todos os elementos que passaram pelo laço, x 2.
        doublev=vet[i] * 2;
    System.out.println(doublev);
    }
    //declarando uma variável para o array original ficar visível.
    for(int origin : vet){
        System.out.println(origin);
    }
    



    }

   } 

