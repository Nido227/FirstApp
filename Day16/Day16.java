package Day16;
import java.util.Scanner;
public class Day16 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String str = "Sunday is Java Day";
int count = str.length();
char last = str.charAt(count-1);
char beforeLast = str.charAt(count-2);
String low = str.toLowerCase();

System.out.println(str.toUpperCase());
System.out.println(low);

//getting last 2 characters
System.out.println(str.substring(16, 18));
System.out.println(""+ beforeLast + last);
System.out.println(str.substring(count-2, count));

int positionOfIs = str.indexOf("is");
System.out.println("position of is: " + positionOfIs);
System.out.println(str.contains("Java"));
System.out.println(str.indexOf("Java"));

}    
}
