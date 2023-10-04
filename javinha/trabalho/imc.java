/*Nome: Vinícius Rotter
Email: rottervini@gmail.com*/
package trabalho;

import java.util.Scanner;

public class imc {
    public static void main(String args[]){
    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Digite seu peso: ");
        float peso = scan.nextFloat();
        System.out.println("Digite sua altura: ");
        float alt = scan.nextFloat();
        float calc = peso/(alt*alt);
        System.out.println("IMC: " +calc);
        if(calc<20){
        System.out.println("Abaixo do peso.");}
        if(calc>=20 && calc <25 ){
        System.out.println("Peso ideal.");}
        if(calc>=25 && calc <30){
        System.out.println("Sobrepeso.");}
        if(calc>=30 && calc <=35){
        System.out.println("Obesidade Moderada.");}
        if(calc>=40 && calc <=50){
        System.out.println("Obesidade Mórbida.");}
        if(calc>50){
        System.out.println("Super Obesidade.");}
    }
}
}
