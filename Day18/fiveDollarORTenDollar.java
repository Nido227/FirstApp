package Day18;
import java.util.Scanner;
public class fiveDollarORTenDollar {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

// ask user to enter 5$ bill or 10$ bill
// if user enter something else, keep asking

// As long as i dont get 5 or 10, I keep asking
// 

int x = 0;
// idk while(   (x!=5 && x!=10)   ){
while( !  (x==5 || x==10)   ){
System.out.println("Enter $5 or $10 ");
x= scan.nextInt();

}

System.out.println("End Of Loop");


}    
}

