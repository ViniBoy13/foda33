package aula3Array;

public class ex06array {
    public static void main(String[] args){
        //criando array
        double[] vetor = {21, 02, 5, 3, 6, 7, 8, 912, 15};
        //declarando um for para mostrar os elementos do array
        for(double tudo: vetor){
        //variável do par e do ímpar, iniciadas em 0.    
        double pares = 0;
        double impares = 0;
        //se o elemento do vetor for divisível por 2 e terminar em zero == pares.
        if(tudo % 2 == 0){
            pares=tudo;
            System.out.println("Números pares: "+pares );
            
        }
        //se não, ímpares.
        else{
            impares=tudo;
            System.out.println("Números ímpares: "+impares);
        }
        //variável para somar todos os elementos do vetor.
        double somatudo=0;
        //laço de repetição genérico.
        for(int i=0; i<vetor.length; i++){
            //(somatudo+=vetor[i]) é o mesmo que (somatudo=somatudo+vetor[i])
            somatudo+=vetor[i];
            System.out.println("A soma dos elementos é: " +somatudo);
        }
        
        
        }
           
            }
        }
    
    
                

    

