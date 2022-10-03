package Day47;

import java.util.*;

public class Marathon {
    public static void main(String[] args) {
        
        //counting objects
        //there is no way to count object programmatically
        //just by look at new ketword
        //we need to find a block of code that runs when 
        //object is being created so we can 
        //increase the count there

        Bike b1 = new Bike("Kawaski", 4, 80);
        Bike b2 = new Bike("Honda", 3, 60);
        Bike b3 = new Bike("Mercedes", 6, 180);
        Bike b4 = new Bike("Yamaha", 8, 200);

        ArrayList<Bike> allBikes = new ArrayList<>(Arrays.asList(b1,b2,b3,b4));

        for (int i = 0; i <allBikes.size(); i++) {
            System.out.println(allBikes.get(i));
        }
System.out.println("-----------------");
        for (Bike each : allBikes) {

            //System.out.println(each); 
            System.out.println(each.getId() + "---" + each.getBrand());
            each.speedUp(10);
            System.out.println(each.toString());
        }
        System.out.println("-----------------");

        b1.speedUp(10);
        System.out.println(b1.getSpeed());

        Bike.showCurrentCount();

        Bike.resetCount();
        Bike.showCurrentCount();

        Bike b5 = new Bike("acura", 2, 20);
        System.out.println("current id of b5 is " + b5.getId());
        Bike b6 = new Bike("Lexxy", 2, 70);
        System.out.println("current if of b6 is " + b5.getId());
        Bike.showCurrentCount();







    }
}
