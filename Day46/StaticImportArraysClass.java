package Day46;

import static java.util.Arrays.sort;
import static Day47.Bike.showCurrentCount;

public class StaticImportArraysClass {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }   
        
        showCurrentCount();

    }
    
}
