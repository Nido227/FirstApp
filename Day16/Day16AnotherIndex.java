package Day16;
import java.util.Scanner;

import javax.xml.stream.events.EndElement;
public class Day16AnotherIndex {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in)  ;

String str = "Ahmad Omar Al Alousi";
int space1 = str.indexOf(" ");
int space2 = str.indexOf(" ", space1+1);
int space3 = str.indexOf(" ", space2+1);
System.out.println(space1);
System.out.println(space2);
System.out.println(space3);

String word = str.substring(space1+1 , space2);
System.out.println(word);
String word2 = str.substring(space2+1 , space3);
System.out.println(word2);



System.out.println(str.indexOf("A"));
System.out.println(str.indexOf("A",1));
System.out.println(str.indexOf("A",12));

//.isEmpty METHOD
String str1 = "";
System.out.println(str1.isEmpty());
String str2 = "xx";
System.out.println(str2.isEmpty());
String str3 = " ";
System.out.println(str3.isEmpty());

String actualResult = "Amazon.com " + "";
System.out.println(actualResult.isEmpty());

//.startsWith Method
String exampleStr = "Busra";
System.out.println(exampleStr.startsWith("B"));
System.out.println(exampleStr.startsWith("ABC"));

boolean b = exampleStr.startsWith("Bu");
if(b){
    System.out.println("Successful");
}else{
    System.out.println("Not successful.");
}

//.endsWith Method
String strr = "odiljan";
boolean yesOrNo = str.endsWith("no");
System.out.println(yesOrNo);


//Task... Classwork
System.out.println("Please enter a name");
String enteredName = scan.next();
System.out.println("The name you have entered is: " + enteredName);

boolean a = enteredName.startsWith("a") && enteredName.endsWith("x");
if(a){
    System.out.println("The name starts with an a and ends with an x. ");
}else{
    System.out.println("The name does not start with an a and does not end with an x.");
}
int aaa = enteredName.indexOf("a");
System.out.println(aaa);

//Get middle letter(s) of name
int count = enteredName.length();
if(count>2){
    if(count % 2==1){

int midIndex = count/2;
System.out.println(enteredName.charAt(midIndex));        
    }else{
        int midIndex = count/2;
        char midL = enteredName.charAt(midIndex);
        char midR = enteredName.charAt(midIndex-1);
        System.out.println(""+midR+midL);
    
    }
    }


}


} 
