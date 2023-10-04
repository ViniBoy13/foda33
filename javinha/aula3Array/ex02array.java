package aula3Array;

public class ex02array{

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

        //mostrando todos os elementos do array:
        for(double tudo: valores) {
            System.out.println(+tudo);
            
        }
    }
}



