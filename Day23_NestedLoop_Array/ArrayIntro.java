package Day23_NestedLoop_Array;
import java.util.Scanner;
public class ArrayIntro {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int i1 = 10;
int i2 = 20;
int i3 = 30;
int i4 = 40;
int i5 = 50;

// declared int array variable
// and we assiged an int array object with a capacity of 5
int[] numbers = new int[5];

// ASSIGNING VALUE TO ARRAY
numbers[0] = 10;
numbers[1] = 15;
numbers[2] = 28;
numbers[3] = 20;
numbers[4] = 3;

System.out.println(numbers[1]);

// create an array of double with size 4
// assign 4 value
// print them all out

double[] prices = new double[4];
prices[0] = 100;
prices[1] = 500;
prices[2] = 1000;
prices[3] = 5000;

System.out.println(prices[0]);
System.out.println(prices[1]);
System.out.println(prices[2]);
System.out.println(prices[3]);

//Task 5
/*
 * declare boolean array variable that point to array of size 5
 * declare short variable
 * declare String array variable
 * declare Scanner array variable
 */


 //THE NUMBER IN [] IS THE CAPACITY OF ARRAY OBJECT
boolean[] onOffs = new boolean[5];
short[] shortNum = new short[2];
String[] strs = new String[20];
Scanner[] manyScan = new Scanner[15];






}   
}
