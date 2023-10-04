package poo2;

public class Conta2 {
    String nome2 = "Yago";
    double saldo2 = 200000;
    double depositar2=5000;
    double saque2 = 150000;
    double nvsaldo2 = saldo2+depositar2;
    
    void nOme2(){
        System.out.println("Nome do dono da conta: " +nome2);
    }
 
    void saldo2(){
        System.out.println("Saldo inicial: " +saldo2);
    }

    void deposito2(){
        System.out.println("quantia de depósito: " +depositar2);
        System.out.println("Seu novo saldo: "+nvsaldo2);
    }

    void saque2(){
        System.out.println("Digite a quantia para sacar: " +saque2);
        double novosaldo2 = nvsaldo2-saque2;
        System.out.println("Seu saldo final: " +novosaldo2);
}


}