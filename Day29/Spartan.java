package Day29;

import javax.sound.midi.VoiceStatus;

public class Spartan {

// method is created inside class
// it should not be inside any method (like main method)

// method is an action  --> always named like doSomething
// method name just like variable name always start with lowercase by convention, use camelCase for multiple words

public static void releaseTheHorse(){
System.out.println("REALEASE IT NOW PLEASE.");
System.out.println("GO!!!");
}

public static void holdYourHorse(){
    String owner = "Nido";
    System.out.println(owner + " hold ur horse please!");
}




public static void main(String[] args) {

Spartan.releaseTheHorse();
Spartan.releaseTheHorse();
// if you are in same class where the method is defined
// className. is optional
releaseTheHorse();
Spartan.holdYourHorse();
holdYourHorse();


// Release the horse

// We will start with a
/**
 * method that does not take external data
 * method that does not return any value
 * method that does not need an object to be called
 * 
 *  Arrays.toString(arr)
 *  Spartan.releaseTheHorse();
 * 
 * 
 * public --- access modifier -- to define where it can be used 
 * static --- non-access modifier
 *              if defined, it means no object needed to call this
 * void --- it means this method only takes action and does not return any value
 **/


}






}
