package Day20;
import java.util.Scanner;
public class LoopPractice {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);    


String name = scan.next();

//char c = name.charAt(0);
String fUp = name.substring(0,1).toUpperCase();
String expected = fUp + name.substring(1);

System.out.println(expected);

//Task 1
// Print your name char by char using do while loop

String name1 = "Nido"; //scan.next();
int x = 0;

do{
    System.out.print(name.charAt(x)+ " ");
    x++; // x = x+1;
}while(x<name1.length());



}
}    
