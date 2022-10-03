package Day22;
import java.util.Scanner;
public class SubStringWithLoop2 {
public static void main(String[] args) {
Scanner scan = new  Scanner(System.in);

// TASK 2:
// give string String str = "ABCDEFH"
//print 2 letter at a time compared to one from previous tasks
//ABCDEGH ----> AB CD EF GH
            //0123456
String str = "ABCDEBC";

//Print 2 letter at a time
//ABCDE ---> AB BC CD DE
//Count number of BC in this string

int count = 0;

for (int i = 0; i < str.length()-1; i++){

    String twoChar = str.substring(i, i+2);
    System.out.println(twoChar);
if(twoChar.equals("BC")){
    count++;
}
}    
System.out.println(count);



}
}