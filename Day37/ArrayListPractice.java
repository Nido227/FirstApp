package Day37;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class ArrayListPractice {
public static void main(String[] args) {

// Where we put the type of items, we put it inside <> diamond operator
ArrayList<String> lst1 = new ArrayList<>();

// this is possible to use List as type, will be explained when we learn Inheritance topic
// List<String> ls2 = new ArrayList<>();    ^


//ArrayList is a class that we can use to create arraylist objects
//it has lost of build in functionality to work with data easily

//Adding items
lst1.add("Nido");
lst1.add("Taha");
lst1.add("Yulk");
lst1.add("Terim");

// What we will see if we print arrayList variable directly
System.out.println(lst1);

//getting single item
System.out.println("Item 1: " + lst1.get(0));
System.out.println("Item 2: " + lst1.get(1));
System.out.println("Item 3: " + lst1.get(2));
System.out.println("Item 4: " + lst1.get(3));

String lastItem = lst1.get(3);
System.out.println("Last item: " + lastItem);

//getting the count of the items inside, we use size() method
int count = lst1.size();
System.out.println(  "Item count is: " + count  );

//iterating over each items using loops
for (int i = 0; i <= 3; i++) {
    System.out.println("Item " + (i+1) + " : " + lst1.get(i));
}

System.out.println("------------------------");

//iterating over items using For Each loop
for (String each : lst1) {
    System.out.println(each);
}



}





}
