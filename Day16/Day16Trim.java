package Day16;
import java.util.Scanner;
public class Day16Trim {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String str = "   Go     Java    Spartan";
System.out.println(str);

int indexO = str.lastIndexOf("O");
String part = str.substring(indexO+1);

System.out.println(part.trim());
System.out.println(str.substring(indexO+1));
System.out.println(str.substring(indexO+1).trim());




} 
}
