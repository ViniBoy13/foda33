package aula3Array;

public class ex01array {
    public static void main(String[] args){
        String[] frase = new String[10];
        // (int i=0) Inicia-se uma variável com valor 0.
        // (i<10) Significa que o laço de repetição vai continuar rodando enquanto a variável (i) for menor que 10.
        // (i++) Enquanto a variável for menor que 10, i++ continuará acrescentando elementos restantes.
        for(int i=0; i<10; i++){
            frase[i]= "EU PROGRAMO EM JAVA!!";
            System.out.println(frase[i]);
        }
        
    }
}
