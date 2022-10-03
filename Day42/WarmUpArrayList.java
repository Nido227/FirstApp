package Day42;
import java.util.*;
public class WarmUpArrayList {
public static void main(String[] args) {

ArrayList <Integer> list1 = new ArrayList<>();
list1.add(1);  // --> list1.add (new Integer(1)):
list1.add(2);
list1.add(5);
list1.add(20);
list1.add(50);

//updating 1st item and doubling it
//getting first item
Integer item1 = list1.get(0);
Integer updated1stItem = item1 *2;


list1.set(0, item1);
System.out.println(list1);

//doing above in one shot
//list1.set(0, list1.get(0)*2);
//list1.set(1, list1.get(1)*2);
//list1.set(2, list1.get(2)*2);

//Double using FOR Loop
for (int i = 0; i < list1.size(); i++) {
list1.set(i, list1.get(i) *2 );
}
System.out.println(list1);



//Arrays.asList return a fixed size list and return type is List
//so it has to be sorted in List variable

List <Integer> nums2 = Arrays.asList(1,2,5,10,20);

//creating an ArrayList object with another list object
List <Integer> list3 = new ArrayList<Integer>(nums2);

//creating an ArrayList object with another list object in one shot
List <Integer> list4 = new ArrayList<Integer>(Arrays.asList(1,2,5,10,20));


//reversing list
Collections.reverse(list4);
System.out.println(list4);











}












}
