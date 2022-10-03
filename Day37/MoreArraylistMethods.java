package Day37;

import java.util.ArrayList;

public class MoreArraylistMethods {
public static void main(String[] args) {

ArrayList<Integer> numlst = new ArrayList<>();

numlst.add(100);
numlst.add(200);
numlst.add(300);
numlst.add(400);

System.out.println(numlst);

// if you try to access index that does not exist, index out of bound exception
//System.out.println(numlst.get(7));     ^


//inserting items at certain location

// insert 500 as second item
// when inserting a value, the index SHIFTS TO THE NEXT LOCATION


// add (index, value) 
numlst.add(1, 500);
System.out.println(numlst);

// it should be within range or exception will occur
//numlst.add(10, 500);
//System.out.println(numlst);


//Updating a value inside ArrayList item
// set(index, newValue);
numlst.set(2, 1000);
System.out.println(numlst);

//removing items from arrayList
//remove(ItemValue);
//remove(index);
numlst.remove(1);
System.out.println("Remove method: " + numlst);

//numlst.remove(300);    this remove(index) and we do not have index

numlst.remove(new Integer(300));
numlst.remove(Integer.valueOf(300));   //both of these are the same... valueOf is better?
System.out.println(numlst);

//deleting everything from list
//numlst.clear();
//System.out.println(numlst);

//checking whether an item exists or not
//contain(item); ---> returns a true or false boolean

System.out.println(numlst.contains(1000));
System.out.println(numlst.contains(2000));

//finding out location of item
int indexOf1000 = numlst.indexOf(1000);
System.out.println("Index of 1000: " + indexOf1000);

// isitEmptyOrNot method
boolean isitEmptyOrNot = numlst.isEmpty();
System.out.println("Is it empty or not: " + isitEmptyOrNot);

//counting items
System.out.println("Size of list: " + numlst.size());



}





}
