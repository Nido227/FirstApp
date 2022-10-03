package Day19;
import java.util.Scanner;
public class WarmUpTask {
public static void main(String[] args) {

Scanner scan = new Scanner (System.in);

//ask user to enter a sentence
//if the sentence does not contains java, keep asking

String theSentence = "";

while( ! theSentence.contains("java")){

    System.out.println("Enter the sentence: ");
    theSentence=scan.nextLine();
}
System.out.println("End");



}    
}
