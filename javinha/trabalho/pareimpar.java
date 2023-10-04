/*Nome: Vinícius Rotter
Email: rottervini@gmail.com*/
package trabalho;

import java.util.Arrays;

public class pareimpar {
    public static void main(String[] args) {
        int[] vet = {10,3,5,66,23,17,26,89,12,1,8,21};

        //Declarar variáveis par e ímpar;
        int pares = 0;
        int impares = 0;

        for (int numero : vet) {
            //se número/2 terminar em inteiro, então acrescenta 1 no valor de pares;
            if (numero % 2 == 0) {
                pares++;
            }
            //se não, acrescenta ímpares; 
            else {

                impares++;
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);

        //Comprimento do vetor com .length;
        int tamanhoTotal = vet.length;
        System.out.println("b) Tamanho total do vetor: " + tamanhoTotal);

        //Por em ordem crescente o vetor;
        Arrays.sort(vet);
        //Arrays.toString(vet) para mostrar o array na tela como string;
        System.out.println("Vetor em ordem crescente: " + Arrays.toString(vet));
    }
}
