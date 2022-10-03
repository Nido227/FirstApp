package Day23_NestedLoop_Array;
import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
            //012345
String str = "Goksel";
String reverse = "";


for(int i = str.length()-1; i>=0; i--){

reverse += str.substring(i, i+1);
//System.out.print(str.substring(i, i+1));
}
System.out.println(reverse);




}    
}
