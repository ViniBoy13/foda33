package aula3Array;

public class ex13array {
    public static void main(String args[]){
        float litros = 50.0f;
        float valor_litros = 5.59f;
        float desconto = litros*valor_litros*0.05f;
        float total_com_desconto = valor_litros*litros-desconto;
        float total = valor_litros*litros;
        System.out.println("Valor do abastecimento com desconto: " +total_com_desconto );
        System.out.println("Valor do abastecimento sem desconto: " +total);

    }    
}
