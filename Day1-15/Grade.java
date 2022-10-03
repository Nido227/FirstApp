import java.util.Scanner;

public class Grade {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Please enter your score.");

int score = scan.nextInt();

if(score>=90){
System.out.println("You've earned an A!");}
else if(score>=80){
System.out.println("You've earned a B!");}
else if(score>=70){
System.out.println("You earned a C.");}
else{
System.out.println("You need to study you stupid fuck.");}

}
}
