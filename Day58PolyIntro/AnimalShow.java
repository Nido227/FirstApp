package Day58PolyIntro;

public class AnimalShow {
    
    public static void main(String[] args) {
        
 //reference type     object type
        Dog d      =      new Dog();

        //Dog is a Animal
        Animal a1 = new Dog();

        //Dog is a IndoorPet
        IndoorPet d2 = new Dog();

        Horse h1 = new Horse();
        Animal h2 = new Horse();

       // Bad Examples:
       // IndoorPet h3 = new Horse();  Has no relationship
       // Wont work becuase Horse class didn't implement IndoorPet

       //Dog d1 = new Animal();
       // Wont work bc Animal is the "PARENT" class.

       //Animal a1 = new IndoorPet();
       //Can't create an object off an interface!
    }
}
