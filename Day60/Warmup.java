package Day60;

public class Warmup {
    
    public static void main(String[] args) {
        
        //Polymorphism is the ability of the object taking many form
        //AKA, an object can be referred by its own type or its super class type
        //or its interface type that the class implemented

        //Power of Polymorephism -- making correct decision at runtime according to actual object type to call the overriden version of the method

        //Animal a1 = new Dog();
        //a1.makeNoise() ---> woof woof

        //This will give us alot of flexibiity while writing to code
        //we can easily swap the implementation to get correct behavior at runtime
        //we can group object together by its general types and take general action without worrying about details

        //Animal[] allAnimals = {New Dog(), new Cat(), new Horse() };
        //for (Animal each : allAnimal) {
        // each.makeNoise();    }

        //Animal a2 = new Horse();
        //What can you access using a2 reference?
        //ONLY the members that are available in Animal class
        // in order to access Horse specific members we must have Horse reference

        //Only reference type decides what is accessible using the reference variable
        Object o = new Dog();
        System.out.println(o.toString());
        //At Runtime --> new Dog().toString()

        //Dog d = new Object();
    }



}
