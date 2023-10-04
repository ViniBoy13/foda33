package arraylist2;

import java.util.ArrayList;
import java.util.Collections;

public class country {
    public static void main(String args[]){
    ArrayList<String> paises = new ArrayList<>();
    paises.add("Alemanha");
    paises.add("Grécia");
    paises.add("Canadá");
    paises.add("Itália");
    paises.add("França");
    paises.add("Espanha");
    paises.add("Suíça");
    paises.add("Brasil");
    paises.add("Noruega");
    paises.add("Escócia");
    System.out.println("Países em ordem crescente: ");
    //orderna em ordem crescente a lista.
    Collections.sort(paises);
    for(String ordem : paises){
        System.out.println(ordem);
    }
    System.out.println("Países em ordem decrescente: ");
    //ordena em ordem decrescente a lista.
    Collections.reverse(paises);{
    for(String desordem : paises)
        System.out.println(desordem);
    }
    String buscar = "Brasil";
    //encontra a posição de algo no array(indexOf);
    int position = paises.indexOf(buscar);
    //se posicao for diferente de -1, mostra a posicao
    if(position!=-1){
        System.out.println("O Brasil está na posição: " +position);
    }
    else{
        System.out.println("O Brasil não foi encontrado.");
    }
    }
    
}



