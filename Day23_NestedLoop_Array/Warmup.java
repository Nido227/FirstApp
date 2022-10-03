package Day23_NestedLoop_Array;
import java.util.Scanner;
public class Warmup {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

//Write a progtam to get unique characters from a string
// aaabbbccc ---> abc

String str = "aaabbbccc";
String uniqueStr = "";

for(int i = 0; i < str.length(); i++){

String eachChar = str.substring(i, i+1);

if( ! uniqueStr.contains(eachChar)) {
uniqueStr += eachChar;
System.out.print(eachChar);

}
}


}
}
