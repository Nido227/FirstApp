package Day23_NestedLoop_Array;
import java.util.Scanner;
public class CreatingArray2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

//2nd way to create an array with predefined items
// dataType [] variableName = new dataType[] {item1, item2, item3...}
int[] numbers = new int[2];

int[] nums = new int[] {1,2,3,4,5};

//getting the size of an array

int size = nums.length;
System.out.println(size);  //counts amount inside { }

nums[0] = 100;
System.out.println(nums[0]);
System.out.println(nums[size-1]);

//final way to create an array
// declaring and assigning value like this
// can only happen in one statement
int[] nums2 = {1,2,3,4,5,6,7};

//this will not compile
int[] num3;
//num3 = {1,2,3,4};


System.out.println(nums2.length);



}    
}
