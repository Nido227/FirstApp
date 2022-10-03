package Day38;

import java.util.*;

public class CollectionUtilityClass {

public static void main(String[] args) {

// Arrays class is a class that has a lot of static methods to perform common array operation
// Arrays.sort(arrayObject)

//Collections is a class under java.util package to perform common collection object related operation

ArrayList<String> lst = new ArrayList<String>();
lst.add("Etka");
lst.add("Umut");
lst.add("Aygul");
lst.add("Izdar");
lst.add("Amir");
lst.add("Mehmet");

System.out.println(lst);

// sorting arraylist using sort method of Collections class
Collections.sort(lst);
System.out.println(lst);

int amirLocation = Collections.binarySearch(lst, "Amir");
System.out.println("index is: " + amirLocation);

int talmuratLocation = Collections.binarySearch(lst, "talmurat");
System.out.println("index is: " + talmuratLocation);

//reversing collection
Collections.reverse(lst);
System.out.println("Reversed list: " + lst);

//shuffle items inside the list
Collections.shuffle(lst);
System.out.println("Shuffled list: " + lst);

// sort method from ArrayList except an object called Comparator we did
//however even we dont know this type of object
// we do know that any reference variable can be set to null
// and it will just work
//lst.sort(null);








}





}
