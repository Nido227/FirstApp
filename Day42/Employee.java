package Day42;

public class Employee {

// 4 ACCESS MODIFIERS TO RESTRIC ACCESS TO MEMBERS OF THE CLASS
//public   accessible anywhere
//protected   stay tuned for later
//default   only in same package --package private
//private   only in same class

//instance variable --> used to define properties | attribute of objects
String name;
int age;
String title;
double salary;

//instance method --> used to read or manipulate the properties

public void printAllInfo(){
    System.out.println("Name is: " + name + " Age is: " + age 
        + " Title is: " + " Salaray is: " + salary);
}








}
