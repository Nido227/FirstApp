package Day17;
import java.util.Scanner;
public class WhileLoopPractice {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in); 

//Task 2, get even numbers from 0-10

int x = 0;

while(x <= 10){
System.out.println("The value of X is: " + x );
x += 2;  // x = x+2
}

//or

while(x < 11){
    if (x%2 == 0){
        System.out.println("The value of x is: " + x );
    }
    x++;
}



//print odd numbers from 50-100

int z = 50;

while(z <= 100){
    if (z%2 == 1){   //x%2!=0
        System.out.println("The value of x is: " + z );
    }
    z++;
}



}
}
