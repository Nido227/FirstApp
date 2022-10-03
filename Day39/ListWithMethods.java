package Day39;

import java.util.ArrayList;
import java.util.*;

public class ListWithMethods {
public static void main(String[] args) {

List<String> lst = new ArrayList<>();
lst.add("apple");
lst.add("banana");
lst.add("pear");
lst.add("kiwi");   

printItems(lst);

System.out.println(getListFrom(10));
System.out.println(getListFrom(3));
System.out.println(getListFrom(17));

}


public static void printItems(List<String> strlst) {
for (int i = 0; i < strlst.size(); i++) {
System.out.print(strlst.get(i) + " - ");
}
System.out.println();
}

//create a method that accepts a number as ending point
//and returns List of Integer from 1 - that number
public static ArrayList<Integer> getListFrom(int x ) {

ArrayList<Integer> numList = new ArrayList<>();
for (int i = 1; i <= x; i++) {
numList.add(i);
}
return numList;
}



}

