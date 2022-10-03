package Day33;
import java.util.Scanner;
public class ReturnKeyword {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
System.out.println("Enter number: ");
int num = scan.nextInt();
if(num < 0){
//once return keyword is reached, method finishes executing
return ;
}

System.out.println("complex statement");
System.out.println("complex statement");
System.out.println("complex statement");
}




}
