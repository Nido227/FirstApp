package Day20;
import java.time.Year;
import java.util.Scanner;
public class SeparatorUsingLoop {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

//java20awesome ------> javaawesome   20

String mix = "Aonline123x";
String numberStr = "";
String azStr = "";

int i = 0;

while(i<mix.length()){
char c = mix.charAt(i);

    if(c>='0' && c<='9'){
    System.out.println(c);
    numberStr = numberStr + c;
}
    i++;
}
System.out.println(numberStr); 


int y = 0;
do {
    char c = mix.charAt(y);

    if(c >= 'a' && c <= 'z'){
    System.out.println(c);
    }
    y++;
}while(y < mix.length());

System.out.println(numberStr);


}    
}
