package Day16;
import java.util.Scanner;
public class ReplacePartOfString {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String str = "Date is 06_17_2022";
str = str.replace('_','-');
System.out.println(str);

str = str.replace("is", "will be");
System.out.println(str);

String str2 = "AABBCC";
System.out.println(str2.replace("A", "Z"));

System.out.println(str.replace("Date will be ", ""));

    
} 
}
