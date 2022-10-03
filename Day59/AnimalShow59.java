package Day59;

import Day58PolyIntro.*;

public class AnimalShow59 {

    public static void main(String[] args) {

    //Cat is a cat
    Cat c1 = new Cat();

    //Cat is a Animal
    Animal a1 = new Cat();

    //Cat is a IndoorPet
    IndoorPet i1 = new Cat();

    //Animal is a cat --> Not a valid statement
    //Cat a2 = new Animal();

    //Cat IS-A Object
    Object o1 = new Cat();

    //Copying the address stores inside c1
    //into c2 variable, and its pointing to the same object
    Cat c2 = c1;

    Animal a1 = c1;

    IndoorPet i1 = c1;

    }

    
}
