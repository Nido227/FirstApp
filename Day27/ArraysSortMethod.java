package Day27;

import java.util.Arrays;

public class ArraysSortMethod {
public static void main(String[] args) {
//Array is mutable, meaning items inside can change
//its not resieable, we cannot increase of decrease the capacity
// Arrays sort method will internally shuffle the item around
//to make it sorted order. low-to-high
int[] nums = {1,4,5,2,77,45};

System.out.println(Arrays.toString(nums));

// SORT METHOD FROM ARRAYS CLASS
// IT TAKES ARRAY OBJECT AND SORT IT'S ITEMS IN ASCENDING ORDER
Arrays.sort(nums);
System.out.println(Arrays.toString(nums));

// Char array
String name = "Cybertek 123";
char[] nameChars = name.toCharArray();
Arrays.sort(nameChars);
System.out.println(Arrays.toString(nameChars));


String[] names = {"abc", "efg", " ","123", "Ku"};
Arrays.sort(names);
System.out.println(Arrays.toString(names));


String[] names1 = {"abc", "afz", "afZ"};
Arrays.sort(names1);
System.out.println(Arrays.toString(names1));


String[] names2 = {"a19999", "a2", "afZ"};
Arrays.sort(names2);
System.out.println(Arrays.toString(names2));


}
}
