package Day42;

import java.util.Arrays;

public class ForEachWithArray {
public static void main(String[] args) {

int[] nums = {1,4,6,7,2};
//updating using for each loop will not work
for (int each : nums) {
    each = 100;
}

//because for each looop get the copy of value inside collection rather than original value
for (int i = 0; i < nums.length; i++) {
    int each = nums[i];
    each = 100;
}

System.out.println(Arrays.toString(nums));




}





}
