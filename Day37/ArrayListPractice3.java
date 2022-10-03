package Day37;
import java.util.*;
public class ArrayListPractice3 {
public static void main(String[] args) {
    
ArrayList<Double> priceList = new ArrayList<>();

priceList.add(1d);
priceList.add(10d);
priceList.add(100d);
priceList.add(1000d);
priceList.add(10000d);

//getting 3rd item
System.out.println(priceList.get(2));

//for loop
for (int i = 0; i < priceList.size(); i++) {
    System.out.println(priceList.get(i));
}

//For Each loop
for (Double eachDouble : priceList) {
    System.out.println(eachDouble);
}

System.out.println("------------");

// Printing out values Greater than 10.  (FOR EACH LOOP)
for (Double eachDouble : priceList) {
    if(eachDouble > 10){
        System.out.println(eachDouble);
    }
}

//getting sum 
double sum = 0;
for (Double each : priceList) {
    sum += each;
}
System.out.println("SUM: " + sum);
}





}
