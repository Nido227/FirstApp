package Day33;

import java.util.Arrays;

public class WarmUp {
public static void main(String[] args) {

// Task 1.1
int[] nums = new int[] {1,2,3,4,5,6};

int sum = getSum(nums);
System.out.println("Sum of all numbers: " + sum);   
// another way of printing this 
System.out.println(getSum( new int []{10,20,30,40,50} ));

// Task 1.2
int max = getMAx(nums);
System.out.println("Max of all numbers: " + max);

// Task 1.3
String[] names = {"Emine", "Nido", "Taha", "Semih"};
String concatResult = addAll(names);
System.out.println(concatResult);

// Optional Task
String sentence = "Nido java";
System.out.println(getMyString(sentence));
}   

public static int getSum(int[] arr) {
int sum = 0;
for (int each : arr) {
    sum+=each;
}
return sum;    
}

public static int getMAx(int[] nums) {
int max = nums[0];
for (int i = 0; i < nums.length; i++) {
if (max < nums[i]){
max = nums[i];
}
}
return max;
}

public static String addAll(String[] strs) {
String concatenation = "";
for (int i = 0; i < strs.length; i++) {
    concatenation+= strs[i];
}
return concatenation;
}

public static String getMyString(String sentence) {
String firstChar = sentence.substring(0,1);
String[] allWords = sentence.split(" ");
String lastWord = allWords[allWords.length-1];
    
String targetWord = firstChar + lastWord.substring(1);
return targetWord;

}



}
