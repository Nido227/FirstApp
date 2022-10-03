package Day59;

import Day58PolyIntro.Dog;
import Day58PolyIntro.Horse;

public class AnimalMethodHiding {
    
    public static void main(String[] args) {

        // Animal.doStatic();
        // Dog.doStatic();
        // Horse.doStatic();

        Animal myAnimal1 = new Dog();
        myAnimal1.doStatic();

        Animal myAnimal2 = new Horse();
        myAnimal2.doStatic();

        Animal myAnimal3 = new Cat();
        myAnimal3.doStatic()l


        

    }

}
