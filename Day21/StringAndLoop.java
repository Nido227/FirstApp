package Day21;
import java.util.Scanner;
public class StringAndLoop {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String name = "Muhammed";

int count = name.length();

for(int i=0; i<count; i++){
    System.out.print(name.charAt(i)+ " ");
    }

System.out.println(

);
for( int i = count-1; i>=0; i--){
        System.out.print(name.charAt(i)+ " ");
    }

String newStr = "";
int x = name.length()-1;
newStr = newStr + name.charAt(x);

}    
}
