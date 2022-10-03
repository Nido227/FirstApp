package Day27;
import java.util.Scanner;

import javax.xml.stream.events.Characters;
public class ForEachPractice {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

/*System.out.println("Please enter a word.");
String word1 = scan.nextLine();
System.out.println("The word you entered is: " + word1);

char[] characs = word1.toCharArray();

for ( char yes : characs){
System.out.print(yes + "-");
} */
System.out.println("Enter a sentence:");
String sentence = scan.nextLine();
String[] words = sentence.split(" ");

for (String eachWord: words) {
    System.out.println(eachWord);
}


}
}
