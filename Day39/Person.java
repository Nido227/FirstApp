package Day39;
import java.util.*;
public class Person {

// properties of the object defined by instance variable
// by instance variable/field
String name;
int age;
char gender;

//public static void eat() {
public void eat() {
System.out.println("eating ");
}

public void tellMeYourName(){
    System.out.println("My name is " + name);
}

public void printPersonInfo(){
    System.out.println("My name is " + name + 
                " my age is: " + age + 
                " my gender is: " + gender);
}

}