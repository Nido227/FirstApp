package Day22;
import java.util.Scanner;
public class StringReview {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

//String Review
            //0123456789012345678901
String str = "Java String is Awesome";
int count = str.length();

System.out.println("The length of this string is: " + count);

int lastIndex = count -1;
System.out.println("The last index is: " + lastIndex);

//getting index of "String"
int indexOfString = str.indexOf("String");
System.out.println(indexOfString);

//getting index of "A"
int indexOfA = str.indexOf("A");
System.out.println(indexOfA);

//Practice
String part = str.substring(12,14);
System.out.println(part);
System.out.println(str.substring(1,6));

// IF MORE THAN 1---> First occurance
int indexOfFirstA = str.indexOf("a");
System.out.println(indexOfFirstA);
System.out.println(str.indexOf("a", indexOfFirstA+1));


}    
}
