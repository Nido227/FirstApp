import java.util.Scanner;

import javax.security.auth.login.ConfigurationSpi;
public class MoreStingMethod {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

//subString(beginggingIndex, EndingIndex)
             //012345
String name = "Merzet";

//rze
System.out.println(name.subSequence(2, 5));
//System.out.println(name.subSequence(5, 1)); DOESNT MAKE SENSE
System.out.println(name.subSequence(1, 6)); //includes the "t"

//Task 1

String name1 = "Nido";
int count = name1.length();

System.out.println(name1.charAt(3));
//or
//System.out.println(name1.subSequence(-1, count));
System.out.println(name1.subSequence(0, 2));
System.out.println(name1.subSequence(1, 4));
System.out.println(name1.length());
System.out.println(name1.toLowerCase());
System.out.println(name1.toUpperCase());
System.out.println(name1.contains("N"));

int midpoint = count/2;
System.out.println(midpoint);






}    
}
