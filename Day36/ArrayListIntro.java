package Day36;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListIntro {
public static void main(String[] args) {

int i = 10;
Scanner scan = new Scanner(System.in);
Double d = new Double("2.14");
float f = 1.4f;

//an ArrayList variable lst1 is created
//an ArrayList object is created and assigned to lst1
//it did not specify what we can store in this arraylist
//so we can store any type


ArrayList lst1 = new ArrayList();
lst1.add("abc");
lst1.add("efg");
lst1.add(new Integer(10));
lst1.add( Character.valueOf('A'));

System.out.println(lst1);


ArrayList<String> lst2 = new ArrayList<>();



}






}
