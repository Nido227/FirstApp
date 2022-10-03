package Day28;

import java.util.Arrays;
public class BinarySearch {
public static void main(String[] args) {


int[] nums = {4, 5, 6, 11, 19, 20, 54};
Arrays.sort(nums);
System.out.println(Arrays.toString(nums));

//ARRAY OBJECT MUST BE SORTED BEFORE USING THIS METHOD

int index = Arrays.binarySearch(nums, 5);
System.out.println(index);

int index20 = Arrays.binarySearch(nums, 20);
System.out.println(index20);

// IF WE DONT HAVE THE ITEM IN THE ARRAY
// WE WILL GET A NEGATIVE NUMBER, TO POINT TO THE INSERTION POINT OF THE ARRAY
// TO KEEP THIS ARRAY SORTED

// {4, 5, 6, 11, 19, 20, 54};

int index10 = Arrays.binarySearch(nums, 10);
System.out.println(index10);

int index100 = Arrays.binarySearch(nums, 100);
System.out.println(index100);

int index3 = Arrays.binarySearch(nums, 3);
System.out.println(index3);

// FILL METHOD  (Can only put 1 number as Value)

int [] nums100 = new int[100];
Arrays.fill(nums100, 5);
System.out.println(Arrays.toString(nums100));





}    
}
