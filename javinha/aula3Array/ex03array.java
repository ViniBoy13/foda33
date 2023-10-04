package aula3Array;

public class ex03array {
    public static void main(String[] args){
        double[] valores = new double[10];
        
        //preencher o array:
        valores[0]= 1;
        valores[1]= 2;
        valores[2]= 3;
        valores[3]= 4;
        valores[4]= 5;
        valores[5]= 6;
        valores[6]= 7;
        valores[7]= 8;
        valores[8]= 9;
        valores[9]= 10;

        //somando elementos
            double soma=0;
            for(int i=0; i<valores.length; i++) {
                soma +=valores[i];
            }
            System.out.println("A soma é: " +soma);
        }
    }

