package poo;



public class MinhaClasse {
public static void main(String[] args) {
// utilizo o nome da classe Carro – obj novocarro e new Carro() (instancia novo objeto)
Carro novocarro = new Carro();
novocarro.tipo = "Passeio";
novocarro.marca = "Chevrolet";
novocarro.modelo = "Onix";
novocarro.ano = 2023;
Carro novocarro1 = new Carro();
novocarro1.tipo = "Onibus";
novocarro1.marca = "Mercedes Bens";
novocarro1.modelo = "Globetrotter";
novocarro1.ano = 2023;
// utilizo os métodos criados..chamando novocarro.metodo
novocarro.Acelera();
novocarro.Parar();
}
}