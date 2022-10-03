package Day23_NestedLoop_Array;
import java.util.Scanner;
public class CreatingArray {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

// ONCE ARRAY IS CREATED WITH GIVEN SIZE
//IT CANNOT BE CHANGED
int[] numbers = new int[2];


numbers[0] = 10;
numbers[1] = 15;
numbers[0] = 100;

System.out.println(numbers[0]);
System.out.println(numbers[1]);

numbers = new int[4];
System.out.println(numbers[0]);





}    
}
