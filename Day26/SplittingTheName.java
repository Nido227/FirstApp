package Day26;

import java.util.Arrays;

import javax.sound.midi.SysexMessage;

public class SplittingTheName {
public static void main(String[] args) {

String str = "Java is fun java is challenging";

String [] words = str.split(" ");
System.out.println(Arrays.toString(words));

String [] parts = str.split("a");
System.out.println(Arrays.toString(parts));

String [] parts2 = str.split("is");
System.out.println(Arrays.toString(parts2));

//Task
// Create a string called groceries
// add items separated by comma
// split them and print them out
// find out size of split
// find out length of each item

String groceries = "eggs, milk, water, bread, cheese";

String [] food1 = groceries.split(",");
System.out.println(Arrays.toString(food1));
System.out.println(food1.length);

System.out.println();

for ( int i = 0; i < food1.length; i++){
    System.out.println(food1[i].trim().length());
}





}
}
