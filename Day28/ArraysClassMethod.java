package Day28;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysClassMethod {
public static void main(String[] args) {

//Arrays Class methods to work with array object

// toString(arrObject) ---> return string representation of array items
// sort(arrObject) ; ---> sort the array
// copyOf(arrObject);  , lengthOfNewArr) ---> new array with length defined and everything copied from original
// copyOfRange(arrObject, from,to) --> works like subString
// equals(arr1, arr2) ---> true false if all elements are the same and in same order
// binarySearch

String[] words = {"coding", "start", "to", "Day", "Perfect", "Sunday"};
Arrays.sort(words);
System.out.println(Arrays.toString(words));

String[] first2Words = Arrays.copyOf(words, 2);
System.out.println(Arrays.toString(first2Words));

String[] tenItem = Arrays.copyOf(words, 10);
System.out.println(Arrays.toString(tenItem));

String [] codingStart = Arrays.copyOfRange(words, 3, 4+1);
System.out.println(Arrays.toString(codingStart));


}
}
