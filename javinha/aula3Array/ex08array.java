package aula3Array;
import java.util.ArrayList;
import java.util.Arrays;
public class ex08array {
    public static void main(String args[]){
        //declarando o vetor.
        String[] carros = {"Porsche", "Camaro", "Lamborghini", "Ferrari", "Aston Martin",
        "Range Rover", "BMW", "Honda Civic", "Mercedes Classic", "Toyota" };
        //mostrando os elementos do vetor a partir de uma variável filha.
        for( String mostrar: carros){
            System.out.println("Lista de carros: " +mostrar);
        }
        //criando um array list a partir do array principal para adicionar mais elementos.
        ArrayList<String> carros2 = new ArrayList<>(Arrays.asList(carros));
        //adicionando elementos, <carros2> é o nome do arraylist, enquanto <carros> é o nome do array. 
        carros2.add("Fiesta");
        carros2.add("Sandero");
        carros2.add("Opala");
        //mostrando a nova lista com os novos elementos.
        for(String cars : carros2){
            System.out.println("Nova lista de carros: " +cars);
        }
    }
    
}
