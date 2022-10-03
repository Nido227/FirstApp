package Day45;
public class Student {

String name;
int age;
String major;

//one constructor can be called
//in another constructor of same class
//this(arguments)

public Student(){

//calling constructor with 1 argument
//to put default name
this("NO NAME");
System.out.println("no arg");

}


public Student(String name){

System.out.println("1 arg " + name);
    
}


public Student(String name, int age, String major) {
    this();
    System.out.println("3 arg");
    // this.name = name;
    // this.age = age;
    // this.major = major;

}




}
