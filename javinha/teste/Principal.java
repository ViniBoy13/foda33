package teste;

public class Principal {
    public static void main(String args[]){
    C1 valor = new C1();
    int resultadosoma = valor.somarValor(50,100);
    C2 valor2 = new C2();
    int resultadomenos = valor2.subtrairvalor(50,100);
    System.out.println("O resultado da adição é : " +resultadosoma);
    System.out.println("O resultado da subtração é : " +resultadomenos);
}

}