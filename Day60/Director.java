package Day60;

import Day51.Dog;

public class Director extends Manager{
    //double salary;
    //int budget;
    int stockOption;

    public static void main(String[] args) {

        Director e1 = new Director();

        Employee e = new Director();
        System.out.println(e.salary);

        //how to access directors stock option?
        //in order to access director specific field we need to refer to the director as a director

        long myLong = 100;     //upcasting
        int i = (int) myLong;  //downcasting

        Director d = (Director) e;
        System.out.println(d.salary);
        System.out.println(d.budget);
        System.out.println(d.stockOption);

        Object o = new Dog();
        Dog puppy = (Dog) o;
        puppy.makeNoise();



        
    }
}
