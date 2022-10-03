package Day29;
import java.util.Scanner;
public class MethodWithParameter {
public static void main(String[] args) {
    
holdYourHorse("Nido");    
holdYourHorse("David");
holdYourHorse("Fatma");
holdYourHorse("Sumeyye");

Scanner scan = new Scanner(System.in);
System.out.println("Who is not holding the horse???");
String name = scan.next();
holdYourHorse((name));
}
                                // parameter
public static void holdYourHorse(String owner){
//String owner = "Nido";

System.out.println(owner + ", hold ur horse please!");
}





}
