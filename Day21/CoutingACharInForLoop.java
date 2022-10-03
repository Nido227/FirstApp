package Day21;
import java.util.Scanner;
public class CoutingACharInForLoop {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
 
String str = "AAccBBBdEEEf";
//get unique character out of above string

String newStr = "";

// Store first char into newStr
// Store next chat into NewStr if it's not already there

newStr = newStr + str.charAt(0);

if(newStr.contains(str.charAt(1) + "")){
    newStr = newStr+str.charAt(1);
}
System.out.println(newStr);


//for(int i=0; i <str.length(); i++){
  //  System.out.println(str.charAt(i));
//}

 }   
}
