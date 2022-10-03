import java.util.Scanner;
public class StringClassPractice {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);    

String s1 = "abc";
String s2 = "ABC";

boolean b1 = s1.equals("abc");
boolean b2 = s2.equals("s2");

System.out.println(b1);
System.out.println(b2);


int countOfCharacter = s1.length();
System.out.println(s1.length());


System.out.println("Please enter a name.");
String name1 = scan.next();
System.out.println("Please enter another name.");
String name2 = scan.next();

System.out.println("Is it the same name > : " + name1.equalsIgnoreCase(name2));

int count1 = name1.length();
int count2 = name2.length();

if(count1>count2)
System.out.println(name1.charAt(1));
else
System.out.println(name2.charAt(2));

//System.out.println(    (count1>count2) ? name1.charAt(1) : name2.charAt(2)   );

//getting last character
int lastCharIndex = count1-1;
char lastChar = name1.charAt(lastCharIndex);
System.out.println("last charcater of name 1 is: " + lastChar);

//Types of data yupe are supported in switch variable


//WHOLE NUMBERS within the range of int (byte, short, int)
//char, string


/*
 * charAt ---- s1.charAt*position of char)
 *             s1.charAt(0) first character 
 * length  ----- s1.length(); count of the character
 *         s1.length() -1; last character of sting
 *       
 * 
 */

}    
}
