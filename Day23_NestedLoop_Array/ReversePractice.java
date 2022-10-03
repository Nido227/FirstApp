package Day23_NestedLoop_Array;
import java.util.Scanner;
public class ReversePractice {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.println("Please enter something, I will reverse it. ");
String str = scan.nextLine();
String reverse = "";

for(int i = str.length()-1; i>=0; i--){
    reverse += str.substring(i, i+1);
}
System.out.println("The reverse of " + str + " is " + reverse);
}
}


