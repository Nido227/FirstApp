package Day48;

import Day49.Animal;

// if the field is in the same package different class
// protected, default are both accessible

//if the field is in different package in sub class
// protected + public can be accessible

public class Outsider extends Animal{
    public static void main(String[] args) {
        
        Outsider a = new Outsider();
        System.out.println(a.wild);
        //System.out.println(a.breed);
        //System.out.println(a.legCount);
        System.out.println(a.color);
        



    }
}
