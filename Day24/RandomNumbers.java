package Day24;
import java.util.Arrays;
import java.util.Random;
public class RandomNumbers {
public static void main(String[] args) {
    
Random rand = new Random();
int[] nums = new int[10];


for( int x = 0; x < 10 ; x++){
nums[x] = rand.nextInt(100);
}

System.out.println(Arrays.toString(nums));






}
}
