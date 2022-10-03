package Day35;

import java.util.Arrays;

public class MethodOverloading3 {
public static void main(String[] args) {

doSomething(123);


String name = "Barry";
char[] nameChars = name.toCharArray();
System.out.println(Arrays.toString(nameChars));

String[] nameCharsStr = name.split("");
System.out.println(Arrays.toString(nameCharsStr));

Arrays.sort(nameCharsStr);
System.out.println(Arrays.toString(nameCharsStr));

}

//public static void doSomething(int y) {
//System.out.println("do something 22121");
//}

public static void doSomething(int y) {
System.out.println("do something 2");
}



}
