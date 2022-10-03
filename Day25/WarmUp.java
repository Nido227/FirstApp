package Day25;
import java.util.Arrays;
public class WarmUp {
public static void main(String[] args) {

//Arrays is a class specifically designed for
//Working on array object with many pre-defined methods

//Arrays.toString(yourArrayOberjectHere) ----> [item1.item2.....lastItem]

//create an array of in with cap. of 50
//store 1-50 inside
int[] nums = new int[50];
for( int i = 0; i <= 49; i++){
nums[i] = i+1;
}
System.out.println(Arrays.toString(nums));

System.out.println();

//create another array of int with capacity of 50
//store even numbers from 0-100 inside
//print them out
int[] even = new int[51];
for( int x = 0; x <= 50; x++){
    even[x] = x*2;
}
System.out.println(Arrays.toString(even));










}
}
