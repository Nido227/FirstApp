package Day47;
import java.util.*;

public class StudentsUtility {

//create a private static field called studentList as ArrayList of String
private static ArrayList<String> studentList = new ArrayList<>();

//create a static block to print out welcome to StudentUtility
static{
    System.out.println("Welcome to StudentsUtility");
}

// create another static block
// initialize ArrayList object and add 10 student
static{
    loadAllMyData();
    System.out.println("ALL STUDENT HAVE BEEN LOADED");
}

//create method called displayAllStudent accept no param return nothing
public static void displayAllStudent(){
    for (int i = 0; i < studentList.size(); i++) {
        System.out.println("No: " + (i+1) + "-> " + studentList.get(i));
    }
}

//adding 1 student
public static void addOneStudent(String name){
    studentList.add(name);
}

//loading all info
private static void loadAllMyData(){
    studentList = new ArrayList<String>();
    studentList.add("Nido");
    studentList.add("Yulk");
    studentList.add("Taha");
    studentList.add("Omer");
    studentList.add("Mark");
    studentList.add("Hasan");
    studentList.add("David");
    studentList.add("Serg");
    studentList.add("Semih");
    studentList.add("Rene");
}

//updating student info
public static void updateStudent(int index, String newName){
    if(index >=studentList.size()){
        System.out.println("OUT OF RANGE");
        return;
    }
    studentList.set(index, newName);
}

//removing a student
public static void removeStudent(int index){
    if(index >=studentList.size()){
        System.out.println("OUT OF RANGE");
        return;
    }
    studentList.remove(index);
}

//resetting the list
public static void resetTheList(){
    studentList.clear();
}




// public static void main(String[] args) {
//     displayAllStudent();

//     System.out.println("--------------");
//     addOneStudent("Tolga");
//     displayAllStudent();

//     System.out.println("---------------");
//     updateStudent(3, "JORGE");
//     displayAllStudent();

//     System.out.println("----------------");
//     removeStudent(5);
//     displayAllStudent();

//     System.out.println("------------------");
//     resetTheList();
//     displayAllStudent();
// }


}
