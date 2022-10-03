package Day42;

import java.util.*;

public class ArrayListReverse {
public static void main(String[] args) {

List <Integer> lst1 = new ArrayList<Integer>(Arrays.asList(1,2,5,10,20));
System.out.println(lst1);

//creating a new list and adding items from the back will work

ArrayList<Integer> lst2 = new ArrayList<>();
for ( int i = lst1.size()-1; i>=0; i--){
//System.out.println(lst1.get(i));
lst2.add(lst1.get(i));
}
System.out.println(lst2);

//new requirement -- DO NOT CREATE NEW LIST, MODIFY ORIGINAL LIST

//swap first item with last item
Integer temp = lst1.get(0);   //storing first item value in temp
lst1.set(0, lst1.get(lst1.size())-1);  //updating first item value to last item
lst1.set(lst1.get(lst1.size())-1, temp); // last to first

System.out.println(lst1);

/*for (int i = 0; i < lst1.size()/2; i++) {
    Integer temp1 = lst1.get(i);  
    lst1.set(i, lst1.get(lst1.size())-1 -i);  
    lst1.set(lst1.get(lst1.size())-1 -i, temp1);  

}  */

// swaping 2nd item with 4th item
temp = lst1.get(1);  
lst1.set(1, lst1.get (5 -2) ) ;
lst1.set(5 - 2, temp); 




}






}
