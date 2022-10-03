package Day58PolyIntro;

public class Dog extends Animal implements IndoorPet{
    public String breed;
    public String legsCount = "Dog leg";

    public void makeNoise(){
        System.out.println("Woof Woof");
    }

    public static void doStatic(){
        System.out.println("Dog static");
    }
    
}
