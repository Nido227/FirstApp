package Day42;

import java.util.*;

public class ForEach {
public static void main(String[] args) {

ArrayList <Integer> list4 = new ArrayList<Integer>(Arrays.asList(10,2,33,24,15));

int i = 10;
int j = i;
j = 100;

System.out.println(i);

for (Integer each : list4) {
//System.out.println("item: " + each);
}

for (int x = 0; x < list4.size(); x++) {
//copying value of item
Integer each = list4.get(x);
//changing the value of copy not original
each = 100;
//System.out.println("item: " + each);
}

System.out.println(list4);
//System.out.println();




}







}
