package Day19;
import java.util.Scanner;
public class LoopingChars {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

/*//how to check whether a string starts with a-z
String str = scan.next();

char firstChar = str.charAt(0);

//System.out.println('a'> 'b');
if(firstChar >= 'a'  && firstChar < 'z'){
System.out.println("lower case letter");
}else{
    System.out.println("NOT a-z"); */


//Task 2, create program like above to check user input first character started with number, end with uppercase

System.out.println("Please enter a word. ");
String theWord = scan.nextLine();

char firstCharacter = theWord.charAt(0);
char lastCharacter = theWord.charAt(theWord.length()-1);

if((firstCharacter >= '0' && firstCharacter <= '9') && (lastCharacter >= 'A' && lastCharacter <= 'Z')){
System.out.println("Both worked, great");
}else{
    System.out.println("does not start with a number and end w Capital");
}



}    
}
