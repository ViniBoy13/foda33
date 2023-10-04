package arraylist2;
import java.util.ArrayList;
public class veiculos {
 public static void main(String args[]){
    ArrayList<String> carros = new ArrayList<>();
    carros.add(0,"MC Laren");
    carros.add(1,"BMW");
    carros.add(2,"Camaro");
    carros.add(3,"Corsa");
    carros.add(4, "Opala");
    carros.add(5, "Chevrolet Onix");
    carros.add(6, "Sandero");
    carros.add(7, "Golf GTI");
    carros.add(8, "Prisma");
    carros.add(9, "Fiesta");
    carros.remove(2);
    System.out.println(carros);
    carros.size(); 
    System.out.println(carros.size());
    carros.contains("Sandero");
    System.out.println(carros.contains("Sandero"));
    

 }   
}
