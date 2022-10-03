package Day18;
import java.util.Scanner;
public class WhileLoopMultipleCondition {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.print("Please enter a number: ");

int targetCount = scan.nextInt();
int x = 1;

while(x<=targetCount){
    
    System.out.print(x + " ");
    x++;
}
System.out.println();
System.out.println(" The");
System.out.println(" End");


}
}