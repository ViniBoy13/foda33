package arraylist2;
import java.util.Scanner;
import java.util.ArrayList;
//criando uma classe;
public class testepoo {
    //definindo um array;
    private ArrayList<Integer> deznumeros;
//chamando a classe;
public testepoo(){
    //adicionando caracteristicas ao array;
    deznumeros = new ArrayList<Integer>(10);
}
//criando uma função para ler números;
public void lernum(){
    //declarando o Scanner;
    try(Scanner scan = new Scanner(System.in)) {
        //pedindo ao user 10 números;
        System.out.println("Digite 10 números: ");
        //criando um laço de repetição;
        for(int i=0; i<10; i++){
            //criando uma variável para os números escolhidos pelo user;
            int escolha = scan.nextInt();
            //adicionando ao array os valores escolhidos pelo user;
            deznumeros.add(escolha);
            
        }

    }
}  
//criando uma função para mostrar os números na tela;
public void printnum(){
    System.out.println("Números escolhidos: " );
    //declarando uma variável para exibir os elementos escolhidos, referênciando o array;
    for(int chosen : deznumeros){
        //mostrando na tela a chosen;
        System.out.println(chosen);
    }
} 

public static void main(String args[]){
    //criando uma variável para chamar as funções criadas.
    testepoo chama = new testepoo();
    chama.lernum();
    chama.printnum();
/*verificando se as funções retornaram algum tipo de dado, caso não retornasse(que foi o q aconteceu)
cria-se uma variável que vai pegar do arraylist os elementos da posição 0 até a 9, que foram exatamente a escolha do usuário; */ 
if(!chama.deznumeros.isEmpty()){
    //.get retorna o valor da posição indicada.
    //neste caso, o <chama.deznumeros.get> só está funcionando para o <printnum>, pq ele não retornou nenhum dado, está vazio(empty) que é a condição do if;
    int escolha1 = chama.deznumeros.get(0);
    int escolha2 = chama.deznumeros.get(1);
    int escolha3 = chama.deznumeros.get(2);
    int escolha4 = chama.deznumeros.get(3);
    int escolha5 = chama.deznumeros.get(4);
    int escolha6 = chama.deznumeros.get(5);
    int escolha7 = chama.deznumeros.get(6);
    int escolha8 = chama.deznumeros.get(7);
    int escolha9 = chama.deznumeros.get(8);
    int escolha10 = chama.deznumeros.get(9);
    //declarando duas variáveis, uma para valor máximo e outra para valor mínimo;
    /*note que normalmente, você deve inicializar min e max com os valores das duas primeiras variáveis e, em seguida, iterar sobre as outras variáveis para encontrar o mínimo e o máximo. A razão para começar com os valores das duas primeiras variáveis é simplesmente uma escolha arbitrária, pois você precisa começar de algum lugar e esses valores iniciais são convenientes. Não há um motivo específico para começar com escolha1 e escolha2 além de simplicidade e clareza no código;*/
    int min = escolha1;
    int max = escolha2;
    //declarando um array com os valores remanescentes;
    int vars[] = {escolha1, escolha2, escolha3, escolha4, escolha5, escolha6, escolha7, escolha8, escolha9, escolha10};{
        //declarando um laço de repetição com for.
        for(int i=0; i<vars.length; i++){
            //se algum elemento do laço de repetição for menor que o min(escolha1)
            if (vars[i]<min){
                // o mínimo passa a ser aquele cujo era menor que ele;
                min = vars[i];
            }
            //se algum elemento do laço de repetição for maior que o max(escolha2)
            if(vars[i]>max){
                // o máximo passa a ser aquele cujo era maior que ele;
                max = vars[i];
            }
        }//daqui pra frente qualquer macaco entende;
        System.out.println("O valor mínimo é: " + min);
        System.out.println("O valor máximo é: " + max);
    }
    System.out.println("Escolha 1: " +escolha1);
    System.out.println("Escolha 2: " +escolha2);
    System.out.println("Escolha 3: " +escolha3);
    System.out.println("Escolha 4: " +escolha4);
    System.out.println("Escolha 5: " +escolha5);
    System.out.println("Escolha 6: " +escolha6);
    System.out.println("Escolha 7: " +escolha7);
    System.out.println("Escolha 8: " +escolha8);
    System.out.println("Escolha 9: " +escolha9);
    System.out.println("Escolha 10: " +escolha10);
int somaarray = escolha1+escolha2+escolha3+escolha4+escolha5+escolha6+escolha7+escolha8+escolha9+escolha10;
System.out.println("Valor da soma dos elementos: " +somaarray);
}

}
}
