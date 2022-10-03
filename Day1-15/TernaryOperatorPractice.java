import java.time.format.TextStyle;
import java.util.Scanner;

public class TernaryOperatorPractice {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

String weather = "sunny" ;
String action = "" ;

System.out.println("How is the weather today? ");
String outsideweather = scan.next();

action = (outsideweather.equalsIgnoreCase("sunny") 
|| (outsideweather.equalsIgnoreCase("nice")) ? "go outside" : "stayhome") ;
System.out.println(action);




}
}