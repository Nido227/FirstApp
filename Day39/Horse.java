package Day39;

public class Horse {

//Instance field/variable
//To define properties/ attributed of object that are being created out of this class
String breed;
int age;
String color;
double height;


public static void main(String[] args) {

//each objects attributes are completely independent from other objects that are created from the same class

Horse h1 = new Horse();
h1.age = 4;
h1.breed = "Taha Horse";
h1.color = "zenci black";
h1.height = 5.10;

Horse h2 = new Horse();
h2.age = 10;
h2.breed = "Arabian";
h2.color = "Grey";
h2.height = 5.5;

System.out.println(h1.color);
System.out.println(h2.height);

// reassigned to new value
h1.color = "Brown";
System.out.println(h1.color);

System.out.println("Horse 1= " + h1.age + " : " + h1.breed + " : " + h1.color + " : " + h1.height);





}





}
