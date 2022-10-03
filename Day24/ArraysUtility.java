package Day24;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysUtility {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int[] nums = {1,45,33,100,8};
System.out.println(nums);

//Array is object that store multiple items of same type

//Arrays class that comes with JDK just like scanner
//Arrays class is in java.util package
//It provides lots of pre-defined methods to work with
//Array objects

String str = Arrays.toString(nums);
System.out.println(Arrays.toString(nums));
System.out.println(str);



}
}
