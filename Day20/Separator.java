package Day20;
import java.util.Scanner;
public class Separator {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

//java20awesome ------> javaawesome   20


String mix = "Aonline123x";

char c = mix.charAt(0);

//check whether c is between 0 and 9
if(c>='0' && c<= '9'){
    System.out.println("Number!");
}else{
    System.out.println("NOT");
}

if(c>='A' && c<= 'A'){
    System.out.println("UPPERCASE!");
}else{
    System.out.println("NOT UPPERCASE");
}



}
}