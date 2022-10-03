package Day17;
import java.util.Scanner;
public class WhileLoop {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

//boolean b = true;

// iteration 1:1
// iteration 2:2
// iteration 3:3
// iteration 4:4
// iteration 5:5

int x =0;
while(x<5 && x>=0){

    ++x;
    System.out.println("Happy Birthday! " + x);
}

int y = 5;
while(y>0){

    System.out.println("Hello! The number is: " + y);
    --y;
}




}
}
