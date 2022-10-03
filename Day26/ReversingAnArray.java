package Day26;

import java.util.Arrays;

public class ReversingAnArray {
public static void main(String[] args) {

// REVERSE THIS ARRAY SO THE VALUE OF NUMBERS ARRAY WILL BE IN REVERSED ORDER
// USING FOR LOOP

int[] numbers = {11,2,39,18,7,4,15};
System.out.println(Arrays.toString(numbers));

int count = numbers.length;
int lastIndex = count-1;

for( int i = 0; i < count/2; i++){

int temp = numbers[i];
numbers[i] = numbers[lastIndex-i];
numbers[lastIndex-i] = temp;
}
System.out.println(Arrays.toString(numbers));



// REVERSING NOT USING FOR LOOP

/*int temp = numbers[0];
numbers[0] = numbers[5];
numbers[5] = temp;

temp = numbers[1];
numbers[1] = numbers[5-1];
numbers[5-1] = temp;

temp = numbers[2];
numbers[2] = numbers[5-2];
numbers[5-2] = temp;

System.out.println(Arrays.toString(numbers));
*/


}
}
