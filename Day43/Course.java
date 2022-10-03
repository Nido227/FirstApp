package Day43;

public class Course {

String name;
int courseID;

//Constructor --> special method that gets
//called whenever an object is created
// it has same name as class name
// it has no return type --(this does not mean return type is voide)

//Modify this constructor
//if any object is being creating using no-art constructor
//the first name should be set to unknown
//the course Id should be set to 100

public Course(){
    this.name = "unknown";
    this.courseID = 100;
    System.out.println("Course constructor");
}

public Course(String name){
    this.name = name;
    System.out.println("passing argument");
}

public Course(String name, int id){
    this.name = name;
    this.courseID = id;
    System.out.println("passing 2 arguments");
}
//public void Course(){}
// ^ not a constructor, shouldnt have return type


}
