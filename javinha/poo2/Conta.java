package poo2;

public class Conta {
    String nome = "Vini";
    double saldo = 34500;
    double depositar=5000;
    double saque = 4812;
    double nvsaldo = saldo+depositar;
    
    void nOme(){
        System.out.println("Nome do dono da conta: " +nome);
    }
 
    void saldo(){
        System.out.println("Saldo inicial: " +saldo);
    }

    void deposito(){
        System.out.println("quantia de depósito: " +depositar);
        System.out.println("Seu novo saldo: "+nvsaldo);
    }

    void saque(){
        System.out.println("Digite a quantia para sacar: " +saque);
        double novosaldo = nvsaldo-saque;
        System.out.println("Seu saldo final: " +novosaldo);
}


}
