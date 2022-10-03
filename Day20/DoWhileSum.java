package Day20;
import java.util.Scanner;
public class DoWhileSum {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

//Task 3:
//Use do while loop to get the sum of 1 till 10.

int x = 1;
int sum = 0;

do{

    sum = sum + x ;
    System.out.println( "x: " + x + " sum: "+ sum );
    x++;

    if(sum > 40)
    break;

}while( x <= 10);


}   
}
