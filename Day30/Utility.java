package Day30;
import java.util.Scanner;

import Day29.Spartan;
public class Utility {
public static void main(String[] args) {

// calling the method
printUsersName();
// calling the method
Utility.printUsersName();

// Arrays.sort(arrObject);

// We can call methods coming from different classes
// if the class is under same package
// if the class is under different package
Spartan.releaseTheHorse();

}

public static void printUsersName() {

Scanner scan = new Scanner(System.in);
System.out.println("Enter your name please");
String name = scan.next();
System.out.println("You've entered: " + name);
    

}


}
