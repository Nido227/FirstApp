package Day59;
import Day58PolyIntro.*;

public class AninmalFieldHiding {
    
    public static void main(String[] args) {
        
        Animal myAnimal1 = new Dog();
        System.out.println(myAnimal1.legsCount);
        myAnimal1.makeNoise();

        Animal myAnimal2 = new Horse();
        System.out.println(myAnimal2.legsCount);
        myAnimal2.makeNoise();

        Animal myAnimal3 = new Cat();
        System.out.println(myAnimal3.legsCount);
        myAnimal3.makeNoise();


    }
}
