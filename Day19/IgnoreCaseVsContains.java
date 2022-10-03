package Day19;
import java.util.Scanner;
public class IgnoreCaseVsContains {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String str = "While Loop";

System.out.println(str.equalsIgnoreCase("while loop"));
System.out.println(str.equalsIgnoreCase("while"));
System.out.println(str.contains("While"));
System.out.println(str.contains("while"));



}    
}
