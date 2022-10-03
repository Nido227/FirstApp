package Day30;

public class StringUtility {
public static void main(String[] args) {
reverseString("abc");
reverseString("Java");
reverseString("NewYork");
reverseString("123ABC!@#");


}
public static void reverseString(String str) {
for (int i = str.length()-1;i >= 0; i--) {
System.out.print(str.charAt(i));
}
System.out.println();
}







}
