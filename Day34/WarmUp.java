package Day34;
// ??????
public class WarmUp {
public static void main(String[] args) {

System.out.println(isPalindrome2("nidoooo"));
System.out.println(isPalindrome2("race car"));
System.out.println(isPalindrome2("nido car is cool"));


}

public static boolean isPalindrome(String target) {
String reversed = "";
target = target.replaceAll(" ", "");
for (int i = target.length()-1; i >=0; i--) {
    //System.out.println(target.charAt(i));
    reversed += target.charAt(i) + "";
}
//if(reversed.equals(target) ) {
//   return true;   }
return reversed.equals(target);
}

public static boolean isPalindrome2(String target) {
String reversed = reverseString(target);
target = target.replaceAll(" ", "");
reversed = target.replaceAll(" ", "");
     
return reversed.equals(target);
}


public static String reverseString(String target) {
String reversed = "";
for (int i = target.length()-1; i >=0; i--) {

//System.out.println(target.charAt(i));
reversed += target.charAt(i) + "";    
}
return reversed;
}



}
