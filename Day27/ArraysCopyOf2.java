package Day27;

import java.util.Arrays;

public class ArraysCopyOf2 {
public static void main(String[] args) {


String[] dcHeros = {"Superman", "Batman", "Aquaman","Wonder Woman", "The Flash","Green Lantern", "Vasyl"};

System.out.println(Arrays.toString(dcHeros));

String[] copyOf0 = Arrays.copyOf(dcHeros, 0);
String[] copyOf2 = Arrays.copyOf(dcHeros, 2);
String[] copyOf6 = Arrays.copyOf(dcHeros, 6);
String[] copyOf10 = Arrays.copyOf(dcHeros, 10);

System.out.println(Arrays.toString(copyOf0));
System.out.println(Arrays.toString(copyOf2));
System.out.println(Arrays.toString(copyOf6));
System.out.println(Arrays.toString(copyOf10));



}
}
