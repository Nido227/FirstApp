package Day23_NestedLoop_Array;
import java.util.Scanner;
public class TaskNestLoop15to5 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

//Task 2
/*
 * print from 15-5 in one line
 * repeat this 4 times
 */

for(int j = 0; j < 4; j++){
    System.out.println("Iteration " + (j+1));
    for(int i = 15; i>=5; i--){
    System.out.print(i + " ");
    }    
    System.out.println();
    }



}
}