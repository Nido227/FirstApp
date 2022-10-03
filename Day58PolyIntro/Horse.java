package Day58PolyIntro;

public class Horse extends Animal{
    public String color;
    public String legsCount = "Horse leg";

    public void makeNoise(){
        System.out.println("Neigh Neigh");
    }
    
    public static void doStatic(){
        System.out.println("Horse static");
    }
    
}
