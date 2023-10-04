package aula3Array;

public class ex11array {
    public static void main(String args[]){
        //declarando variáveis;
        int vet[] = {0,1,2,3,4,5,6,7,8,9,10};
        //criando um laço de repetição;
        for(int i=0; i<vet.length; i++){
            //dizendo que cada elemento é ele mesmo vezes 5;
            vet[i]=vet[i] * 5;
        }
        //criando uma variável para mostrar o vetor na tela;
        for( int tabuada : vet){
            System.out.println(tabuada);
        }
    }
}
