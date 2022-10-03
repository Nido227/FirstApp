import java.util.Scanner;
public class SimpleProgram {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Please enter a number. ");
int num1 =  input.nextInt();

System.err.println("Please enter another number.");
int num2 = input.nextInt();

int total = num1 + num2;
System.out.println("The total of the two numbers is: " + total);

if( total >= 100){
    System.out.println("Great numbers! ");
}else{
    System.out.println("The sum of the two numbers is less than 100. ");
}
}
}
