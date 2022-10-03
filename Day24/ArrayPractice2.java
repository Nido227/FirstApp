package Day24;
import java.util.Scanner;
public class ArrayPractice2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

//create an int array of 5 items and assign value
int[] nums = {1,2,4,8,20};
for( int i = 0; i< nums.length; i++){
    System.out.print(nums[i] + " ");
}

System.out.println();
//double the value of 3rd item: 9---> 18
nums[2] *= 2;    // nums[2] = nums[2] *2

// update the value of 3rd item to sum of 1st and 2nd items
nums[3] = nums[0] + nums[1];
for( int i = 0; i< nums.length; i++){
    System.out.print(nums[i] + " ");
}
System.out.println();

//SWAP the value of first and last item
int temp = nums[nums.length-1];
nums[nums.length-1] = nums[0];
nums[0] = temp;
for( int i = 0; i< nums.length; i++){
    System.out.print(nums[i] + " ");
}

// getting sum of all numbers

int sum = 0;
for( int i = 0; i< nums.length; i++){
    sum = sum + nums[i];
}
System.err.println();
System.out.println("The sum of all the numbers is: " + sum);

//get max number
int max = nums[0];

for( int i = 1; i< nums.length; i++){
    if(nums[i] > max){
        max = nums[i];
    }
  
}
System.out.println(max);

}    
}
