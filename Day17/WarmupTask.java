package Day17;
import java.util.Scanner;
public class WarmupTask {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

//Warmup Task
String sender = "Mike Smith";
String phoneNumber = "202-123-3456";
String messageBody = " I love programming and problem solving";

System.out.println("Sender: " + sender);
System.out.println("Phone number: " + phoneNumber);
System.out.println("Message body: " + messageBody);

//Strings
String a = "abc";
String b = a.concat("efg");
String c = "abcefg";
System.out.println(b==c);

}
}
