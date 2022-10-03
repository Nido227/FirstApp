package Day38;

import java.util.*;

public class ArrayListCreationInOneShot {
public static void main(String[] args) {

// Arrays.asList(var arg) can be used
// add items while object is being created

// However, 
//1 - the variable type MUST BE A LIST
// because the method returns List not ArrayList
//2- It will generate an unmodifiable list
// can not add or remove item
// however you can update using set


List<Integer> lst = Arrays.asList(3,4,5,6,7,5,4,3);
//lst.add(100);   //does not work
//lst.remove(1);   //does not work
//lst.set(0, 100);   //does work

System.out.println(lst);

//Since we can not add or remove item from above list
//we want to copy eveything from the list into the new list that we can modify

ArrayList<Integer> myCoolList = new ArrayList<>(lst);
myCoolList.add(100);
myCoolList.remove(Integer.valueOf(3));
System.out.println(myCoolList);


//List<String> JLA = Arrays.asList("Superman", "Batman", "Wonder woman");
//System.out.println(JLA);

ArrayList<String> JLAcopy = new ArrayList<>(Arrays.asList("Superman", "Batman", "Wonder woman"));
JLAcopy.add("Flash");
JLAcopy.add("Thanos");
JLAcopy.remove("Thanos");

System.out.println(JLAcopy);

}






}
