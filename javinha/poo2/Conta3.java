package poo2;

public class Conta3 {
    String nome3 = "Filipi";
    double saldo3 = 1200000;
    double depositar3=50000;
    double saque3 = 210222;
    double nvsaldo3 = saldo3+depositar3;
    
    void nOme3(){
        System.out.println("Nome do dono da conta: " +nome3);
    }
 
    void saldo3(){
        System.out.println("Saldo inicial: " +saldo3);
    }

    void deposito3(){
        System.out.println("quantia de depósito: " +depositar3);
        System.out.println("Seu novo saldo: "+nvsaldo3);
    }

    void saque3(){
        System.out.println("Digite a quantia para sacar: " +saque3);
        double novosaldo3 = nvsaldo3-saque3;
        System.out.println("Seu saldo final: " +novosaldo3);
}


}