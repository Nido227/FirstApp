package Day46;

public class Person {
 
String name;
float height;
char gender;

static String race = "Human";

static int counter;

public Person() {
    counter ++;
}



public Person(String name, float height, char gender) {
    this.name = name;
    this.height = height;
    this.gender = gender;

    counter ++;
}




}
