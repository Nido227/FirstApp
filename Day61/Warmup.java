package Day61;

public class Warmup {

    public static void main(String[] args) {
        
        int i = 10;
        long i = 10;

        double d = 3.14;
        int a = (int) d;

        System.out.println(a);

        Dog() d1 = new Dog();
        //upcasting
        ANimal a1 = d1; //upcasting
        Dog d2 = (D0g) a1; //downcasting

        Cat c = (Cat) d1;
        Object o = new Object();
        Dog d3 = (Dog) o; //Dog d3 = new Object();

        Object o1 = new Dog();
        Dog d3 = (Dog) o1;


    }
    
    //Polymorphism
    /*
     * Ability of object to take multiple form
     * Ability of object to be referred by its super type
     * and take objects specific action at run time
     * 
     * Animal a = new Dog();
     *        a.makeNoise();
     *        a = new Cat();
     *        a.makeNoise();
     * Animal makeNoise --> Dog --woof, Cat --miao
     * 
     * List<String> lst = new ArrayList<>();
     * 
     * It provides flexibility
     * 
     * We can group  objects together by its general type
     * 
     * Animal[] animals = {new Dog(), new Cat(), new Horse() };
     * 
     * Method Parameters:
     * for example:
     * 
     * public static void AnimalNoiseTester(Animal anyAnimal){
     * 
     * }
     * 
     * What argument we can pass to above method?
     * AnimalNoisetester( new Dog()  );
     * AnimalNoisetester( new Cat()  );
     * 
     * Return Type
     * public static Animal getMyAnimal(){
     * return ---> new Dog() or new Car() or new Horse()
     * }
     * 
     * Each class in java implicitly extends Object if not already extending another class
     * interface does not have this concept
     * 
     * WebDriver driver = new ChromeDriver();
     * 
     * What decides what member can be accessible using the reference variable?
     * ----- ONLY REFERENCE TYPE
     * 
     * Animal a = new Dog();
     * a can access only the memers that are visible to the Animal
     * a.makeNoise() ---> woof
     * 
     * What if we really want to access anything that only exists in Sub class
     * 
     * Dog d = (Dog) a;
     * d.dogStuff();
     * 
     */
}
