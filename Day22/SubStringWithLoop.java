package Day22;
import java.util.Scanner;
public class SubStringWithLoop {
public static void main(String[] args) {
Scanner scan = new  Scanner(System.in);

// TASK 2:
// give string String str = "ABCDEFH"
//print 2 letter at a time compared to one from previous tasks
//ABCDEGH ----> AB CD EF GH

String str = "ABCDEFGHI";

for (int i = 0; i < str.length(); i+=2){
    if(i!=str.length()-1)
System.out.print(str.substring(i, i+2) +  " ");
else
System.out.println(str.substring(i));

}
for (int i = 0; i < str.length(); i+=3){
    if(i!=str.length()-1)
System.out.print(str.substring(i, i+3) +  " ");
else
System.out.println(str.substring(i));

}


}    
}
