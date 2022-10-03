package Day28;

import java.util.Arrays;

public class Warmup {
public static void main(String[] args) {

//REVERSING PRACTICE
String str = "Sunday perfect day to start coding.";

String[] strArr = str.split(" ");
for (int i = strArr.length-1; i>=0; i--) {
System.out.print(strArr[i] + "-");

}

String revStr = "";
int lastIndex = strArr.length-1;

for (int i = 0; i < strArr.length/2; i++) {
   // System.out.print(strArr[i]);
   String temp = strArr[i];
   strArr[i] = strArr[lastIndex-i];
   strArr[lastIndex-i] = temp;
System.out.println(Arrays.toString(strArr));
}

}
}
