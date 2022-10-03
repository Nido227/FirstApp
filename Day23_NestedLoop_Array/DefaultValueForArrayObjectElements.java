package Day23_NestedLoop_Array;
import java.util.Scanner;
public class DefaultValueForArrayObjectElements {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int[] nums = new int[3];
nums[1] = 100;

System.out.println(nums[0]);
System.out.println(nums[1]);
System.out.println(nums[2]);



boolean[] arr1 = new boolean[3];
System.err.println(arr1[0]);

char[] arr2 = new char[3];
System.err.println(arr2[0]);

byte[] arr3 = new byte[3];
System.err.println(arr3[0]);

short[] arr4 = new short[3];
System.err.println(arr4[0]);

long[] arr5 = new long[3];
System.err.println(arr5[0]);

float[] arr6 = new float[3];
System.err.println(arr6[0]);

double[] arr7 = new double[3];
System.err.println(arr7[0]);

//any reference type array will get null if no value assigned

String[] arr9 = new String[3];
System.out.println(arr9[0]);

Scanner[] arr10 = new Scanner[3];
System.out.println(arr10[0]);







}    
}
