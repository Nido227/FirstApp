package Day21;
import java.util.Scanner;
public class Warmup {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.println("Enter two numbers: ");


int x = 0 , y = 0;
int tryCount = 0;

do{
System.out.println("enter num1");
x = scan.nextInt();
System.out.println("enter num2");
y = scan.nextInt();

tryCount++;
if(tryCount==3){
    System.out.println("Too many attempts!");
    break;
}

}while(x+y<=100);





}    
}
