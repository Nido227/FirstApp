package Day40;

import java.util.Random;

public class Phone {

//these istance variables can be accessed inside instant methods directly
//just like its a local variable for that method

//if u are outside of class you need an object to access these attributes


String brand;
String OS;
int capacity;

public void ring() {
    System.out.println("Ringing...");
}

public void dial() {
    System.out.println("Dialing..." );
}

public void displayBrand() {
    System.out.println("Brand: " + brand);
}



}



