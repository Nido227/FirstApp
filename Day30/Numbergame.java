package Day30;
import java.util.Scanner;
public class Numbergame {
// Task 2

/* 2.1
 * Create a static method with no return type
 * called printTheDoubledNumber
 * it takes 1 int as parameter and it will print out double number on the console
 * 
 * 2.2
 * create another static method with no return type
 * called checkForAge
 * it takes 1 int age as parameter
 * inside body, check whether the age is more than 18
 * if at the age is more than 10 --> print adult
 * if not print not an adult
 * 
 */

public static void main(String[] args) {
printTheDoubledNumber(10);
printTheDoubledNumber(3);
checkForAge(21);
checkForAge(12);

}      
// int num is called method parameters
public static void printTheDoubledNumber(int num) {

// body goes here
int doubleNum = num*2;
System.out.println(doubleNum);
}
public static void checkForAge(int age) {
int i = age;
if(age>=18){
    System.out.println("Adult.");
}else{
    System.out.println("Not an adult.");
}
}






}
