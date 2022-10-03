import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class fizzBuzz {
    
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Please enter an integer. ");
int enteredNum = scan.nextInt();

System.out.println("You've entered: " + enteredNum);

if(enteredNum % 5 == 0 && enteredNum % 3 ==0)
System.out.println("Fizz Buzz.");
else if (enteredNum %5 == 0)
System.out.println("Fizz. ");
else if (enteredNum % 3 == 0)
System.out.println("Buzz. ");
else 
System.out.println("Not a Fizz or a Bizz! ");








}
}
