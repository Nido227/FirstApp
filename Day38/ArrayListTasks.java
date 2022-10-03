package Day38;

import java.util.*;

public class ArrayListTasks {
public static void main(String[] args) {

ArrayList<Integer> lst = new ArrayList<>();

//adding 1-100
for (int i = 0; i <=5; i++) {
    lst.add(i);
}
System.out.println(lst);

//sum
int sum = 0;
for (int i = 0; i < lst.size(); i++) {
   sum+= lst.get(i);
}
System.out.println("Sum: " + sum);

//average
int average = sum / lst.size();
System.out.println("The average is: " + average);


System.out.println("--------------------------------------------------------");


//task 2
ArrayList<Integer> lst2 = new ArrayList<>();

//100 - 1
for (int j = 6; j > 0; j--) {
    lst2.add(j);
}
System.out.println(lst2);

int count = 0;
// divisible by 3 and 5
for (Integer each : lst2) {
if(each%3==0 && each%5==0);
count++;
}
System.out.println("The target count is: " + count);


//the logic is: pick each and every item in lst2 and add it to lst1
for (int i = 0; i < lst2.size(); i++) {
    lst.add(lst2.get(i));
}
System.out.println(lst);

// addAll method of ArrayList class
// this will just add every item in lst2 by the end of lst1 items
//lst.addAll(lst2); 
//System.out.println(lst);

// addAll method of ArrayList class, second overloaded version
// this will just add every item in lst2 by the end of lst1 items
lst.addAll(3, lst2);
System.out.println(lst);
}




}


