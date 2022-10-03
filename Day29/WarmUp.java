package Day29;

import java.util.Arrays;

public class WarmUp {
public static void main(String[] args) {

String[][] pizza = {    {"mushroom", "olive", "green pepper"}, 
                        {"spinach", "green pepper", "mushroom"},
                        {"olive", "olive", "spinach"},
                        {"mushroom", "mushroom", "red pepper"},
                        {"banana pepper", "spinach", "red pepper"},
                        {"mushroom" , "green pepper", "green pepper"},
                        {"spinach", "green pepper", "mushroom"}          };
//Task 1.2 print
System.out.println(Arrays.deepToString(pizza));

//Task 1.3 print all the value inside using for loop
for (String[] slice : pizza) {
    for (String topping : slice) {
        System.out.print(topping + " ");
    }
    System.out.println();
}
// Task 1.4 print all the value inside using for loop and skip 3rd slice of pizza
// Task 1.5 print all the value inside using for loop and stop at banana pepper

// labels -- used to label certain loop in nested loop

Spartan:  //label name
for (int i = 0; i < pizza.length; i++) {
    System.out.println("Slice number: " + (i+1));

    if(i==2)
    continue;

    for (int j = 0; j < pizza[i].length; j++) {
       
        if(pizza[i][j].equals("banana pepper")){
            break Spartan;
        }
        System.out.println(pizza[i][j] + " | ");
    }
    System.out.println();
}




}
}
