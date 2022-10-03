package Day23_NestedLoop_Array;
import java.util.Scanner;
public class Print_a_z {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

char a = 'a';
System.out.println(a+1);

char next = (char) (a+1);
System.out.println(next);

//int asciiCode = 'a';
//System.out.print(asciiCode);

for( int i = 'a'; i <= 'z'; i++ ){

    char eachChar = (char) i;
System.out.print(eachChar);
}



}    
}
