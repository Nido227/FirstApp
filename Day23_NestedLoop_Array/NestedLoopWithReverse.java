package Day23_NestedLoop_Array;
import java.util.Scanner;
public class NestedLoopWithReverse {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);


String str = "123";
String reverse = "";

for(int j = 0; j<3; j++){

for( int i = str.length()-1; i>=0; i--){
reverse+=str.substring(i, i+1);
}
System.out.println(reverse);
reverse = "";
}




}    
}
