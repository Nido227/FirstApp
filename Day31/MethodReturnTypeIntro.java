package Day31;

import java.util.Arrays;

import javax.swing.text.AbstractDocument.LeafElement;

public class MethodReturnTypeIntro {
public static void main(String[] args) {

String str = " You know nothing Jon Snow";

int count = str.length();

System.out.println(count);
System.out.println(str.length());
//String arrStr = Arrays.toString(str.toCharArray());

int five = giveMeFive();
System.out.println(five);
System.out.println(giveMeFive());

String name = giveMeMyName();
System.out.println(name);
System.out.println(name.substring(0,2));

}

public static String giveMeMyName(){
    return "Nido";
}


public static int giveMeFive() {
return 5;

}


}
