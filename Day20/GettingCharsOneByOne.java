package Day20;
import java.util.Scanner;
public class GettingCharsOneByOne {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String name = "Muhammed";

int count = name.length();

for(int i=0; i<count; i++){
System.out.print(name.charAt(i)+ " ");
}
System.out.println();

for( int i = count-1; i>=0; i--){
    System.out.print(name.charAt(i)+ " ");
}




}  
}
