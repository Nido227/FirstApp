package Day30;
import java.util.Scanner;

import javax.xml.stream.events.NotationDeclaration;
public class MethodWithParameters {
public static void main(String[] args) {

printTheSum(10.5,20.9);
printTheSum(123.9,200.1);
printTheSum(11.33,44.1);
printTheSum(11,5);

reportName("Nido", "Ozl");
reportName("Taha", "Bostan");




}

public static void printTheSum(double a, double b) {
double sum = a+b;
System.out.println("The sum of the numbers is: " + sum );
}

// Task 

public static void reportName(String firstName, String lastName) {

String fullName = firstName + lastName;
System.out.println("Your first name is: " + firstName + " and the length is: " + firstName.length());
System.out.println("Your last name is: " + lastName + " and the length is: " + lastName.length());
System.out.println("Your initials are: " + firstName.charAt(0) + " " + lastName.charAt(0));

}





}
