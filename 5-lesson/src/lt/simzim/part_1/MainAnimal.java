package lt.simzim.part_1;

import java.util.Collections;
import java.util.LinkedList;


public class MainAnimal {

    public static void main(String[] args) {
            Fish obj = new Fish("Spurga");
            obj.setFinsNum(6);

            Fish obj1 = new Fish("Nemo");
            obj1.setFinsNum(4);

            Hamster obj2 = new Hamster("Kipsas");
            obj2.setColor("Baltas");
            obj2.setTail(10);

            Hamster obj3 = new Hamster("Spurga");
            obj3.setColor("Margas");
            obj3.setTail(8);

            LinkedList zoo = new LinkedList();
            zoo.add(obj2);
            zoo.add(obj);
            zoo.add(obj1);
            zoo.add(obj3);

            // Nerušiuotas sąrašas
            System.out.println("Nerusiuotas sarasas");
            for ( Object pet : zoo) {
                    System.out.println(pet);
            }

            // Atlikta paieška
            System.out.println("Ieskojom Gyvunų vardy spurga");
            findPet("Spurga", zoo);

            // rušiuotas sąrašas
            System.out.println("Rusiuotas sarasas");
            Collections.sort(zoo);
            for(Object pet: zoo){
                    System.out.println(pet.toString());
            }
    }

        static void findPet(String _name, LinkedList<Animal> zoo) {
                for ( Animal pet : zoo) {
                        if(pet.getName().equals(_name)){
                                System.out.println(pet);
                        }
                }
        }
}
