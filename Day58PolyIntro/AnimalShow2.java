package Day58PolyIntro;

public class AnimalShow2 {
    public static void main(String[] args) {

        //String array object
        String[] arr = new String[3];
        
        //Animal array object
        Animal[] animal = new Animal[3];
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Horse();

        animal[0] = a1;
        animal[1] = a2;
        animal[2] = a3;

        for (Animal each : animal) {
            each.makeNoise();
            
        }

        
    }
}
