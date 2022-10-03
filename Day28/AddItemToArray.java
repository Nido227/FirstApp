package Day28;
import java.util.Arrays;
import java.util.Scanner;
public class AddItemToArray {
public static void main(String[] args) {

//Create a program to add items to an array by users input
//{1,2,3,4,5,6} + 17  ---> {1,2,3,4,5,6,17}
    
String[] words = {"coding", "start", "to", "Day", "Perfect", "Sunday"};
Scanner scan = new Scanner(System.in);

System.out.println("Enter your word: ");
String usersWord = scan.next();

String[] newWord = Arrays.copyOf(words, words.length+1);
System.out.println(Arrays.toString(newWord));

int lastSpotIndex = newWord.length-1;
newWord[lastSpotIndex] = usersWord;
System.out.println(Arrays.toString(newWord));






}
}
