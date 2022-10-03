package Day18;
import java.util.Scanner;
public class Warmup {
public static void main(String[] args) {

Scanner scan1 = new Scanner(System.in);
Scanner scan2 = new Scanner(System.in);
Scanner scan3 = scan2;

long x = 10;
long y = 15;

System.out.println(x==y);

System.out.println(scan1==scan2);
System.out.println(scan2==scan3);

String s1 = "literal";
String s2 = new String("literal");

System.out.println(s1.equals(s2));
System.out.println(s1==s2);

}
}
