package Day37;
import java.util.*;
public class RemoveItemFromInteger {
public static void main(String[] args) {

ArrayList<Integer> lst = new ArrayList<>();
lst.add(1);
lst.add(2);
lst.add(3);
lst.add(4);

//KNOW THE DIFFERENCE BETWEEN THESE TWO!
lst.remove(2);
lst.remove((Integer.valueOf(2)));


System.out.println(lst);






}





}
