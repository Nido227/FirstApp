package Day27;

import java.util.Arrays;

public class Warmup2 {
public static void main(String[] args) {


String str = "Cybertek Batch Spartan is the best";
String[] words = str.split(" ");
System.out.println(Arrays.toString(words));

for ( int i = 0; i < words.length; i++){
//System.out.println(words[i]);


String one = words[i] ; //"Cybertek";  //c-y-b-e-r-t-e-k-
char [] cyberChars = one.toCharArray();

for ( int j = 0; j < cyberChars.length; j++){
System.out.print(cyberChars[j] + "-");
}
System.out.println();

}
}
}