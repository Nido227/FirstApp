package Day26;

import java.util.Arrays;

import javax.xml.stream.events.Namespace;

public class CharArrayToString {
public static void main(String[] args) {

String str1 = "Hayrulla";

char[] nameChars = str1.toCharArray();

System.out.println(Arrays.toString(nameChars));

String str2 = "";

for( int i = 0; i < nameChars.length; i++) {
    char c = nameChars[i];
    str2 = str2 + c;
}
System.out.print(str2);

//String str2 = new String(nameChars);
//System.out.println(str2);





}
}
