import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Switch {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("How is the weather today? ");
String weather = scan.next();
weather = weather.toLowerCase();  

switch (weather) {

case "sunny":
System.out.println("go swimming");
break;

case "windy":
System.out.println("go fly a plane");
break;

case "snowy":
System.out.println("go snowboarding");
break;

default:
System.out.println("are you sure this is the weather? ");


}





/*if(weather.equals("Sunny")){
    System.out.println("go swimming");
}else if(weather.equals("Windy")){
    System.out.println("fly kite");
}else if(weather.equals("Rainy")){
    System.out.println("stay home");
}else if(weather.equals("Snowy")){
System.out.println("go snowboarding");
}else{
System.out.println("are you sure this is the weather?"); */



}
}
