package Day20;
import java.util.Scanner;
public class BreakStatement {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

//break statement is used to break out of switch statements and loops

int x = 10;

do{
System.out.println(x);
x++;

if(x>50){
    break;
}

}while(x<100);


}   
}
