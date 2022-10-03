package Day20;
import java.util.Scanner;
public class Counter {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

// how many a's are in this String
String str = "A1 A2 A3 A4";

// go through each and every character, if i see an "a" i will increment my counter by 1
int count = 0;
int x = 0;
do{
    char c = str.charAt(x);
    if(c=='a'|| c=='A'){
        System.out.println("BINGO" + x);
        ++count;
    }
//System.out.println(str.charAt(x));
x++;
}while(x<str.length());
System.out.println(count);


}    
}
