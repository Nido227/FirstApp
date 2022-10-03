package Day27;

import java.util.Arrays;

public class CopyRangeOf {
public static void main(String[] args) {
    
String[] dcHeros = {"Superman", "Batman", "Aquaman","Wonder Woman", "The Flash","Green Lantern", "Vasyl"};

// CopyOfRange method take 3 external data / parameters
// original array, starting index inckusive and ebnding index exclusive
// store the resulting array int new array variable
String[] copyOf1to3 = Arrays.copyOfRange(dcHeros, 1, 3);
System.out.println(Arrays.toString(copyOf1to3));

String[] copyOf3to6 = Arrays.copyOfRange(dcHeros, 3, 6);
System.out.println(Arrays.toString(copyOf3to6));

String[] copyOf3to10 = Arrays.copyOfRange(dcHeros, 3, 10);
System.out.println(Arrays.toString(copyOf3to10));



}
}
