package Day38;

import java.util.*;

public class ArrayListPractice {
public static void main(String[] args) {

ArrayList<String> myList = new ArrayList<>();
myList.add("Zuccini");
myList.add("Cucumber");
myList.add("Cabbage");
myList.add("Watermelon");
myList.add("Blueberry");
myList.add("Apple");
myList.add("Bananas");
myList.add("Milk");
System.out.println(myList);

//count
System.out.println("How many items? : " + myList.size());

//getting single items
System.out.println("getting single items by index: " + myList.get(1));


//update an item
myList.set(0, "Tomatoe");
System.out.println(myList);

//insert an item
myList.add(1, "Rasberry");
System.out.println(myList);

//check an item exists in the list
boolean haveMilkOrNot = myList.contains("Milk" );
System.out.println( "Got milk? " + haveMilkOrNot ) ;

System.out.println( "Got Milk lowercase? " + myList.contains("milk") );

//check location of certin items
int indexOfCabbage = myList.indexOf("Cabbage");
System.out.println("Cabbage index: " + indexOfCabbage);

//remove item
myList.remove(4);
System.out.println(myList);
myList.remove("Blueberry");
System.out.println(myList);

//deleting all from the list
//myList.clear();
//System.out.println(myList);

//checking the list is empty or not
System.out.println("Checking the list is empty or not: " + myList.isEmpty());


for (int i = 0; i < myList.size(); i++) {
    System.out.print(myList.get(i) + " - ");
}
System.out.println();

for (String each: myList) {
    System.out.print(" | Item: " + each);
}





List<String> lst2 = new ArrayList<>();

}






}
