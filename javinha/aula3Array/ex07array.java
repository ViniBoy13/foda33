package aula3Array;

public class ex07array {
    public static void main(String args[]){
        //declarando o vetor
        String[] carros = {"Porsche", "Camaro", "Lamborghini", "Ferrari", "Aston Martin",
    "Range Rover", "BMW", "Honda Civic", "Mercedes Classic", "Toyota" };
    //contado a quantidade de elementos do array criando uma variável.
    //obs: (.length) significa o comprimento do vetor.
    int elementos = carros.length;
    //como a variável criada está igualada ao comprimento do vetor carros, é só chamar ela no println.
    System.out.println("Quantidade de elementos presentes no array: " +elementos);
    //solução genérica para mostrar os elementos de um vetor.
    for( String mostrar: carros){
        System.out.println(mostrar);
    }
    //auto explicativo
    System.out.println("Elemento de posição 8: " +carros[7]);
    }
}
