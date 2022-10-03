package Day23_NestedLoop_Array;
import java.util.Scanner;
public class ExtractLowerCaseFromString {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

//GETTING ONLY LOWERCASE 
String str = "5 little Monkey Jumping on The Bed";

//char eachChar = 'H';
/*System.out.println(eachChar >='a');
System.out.println(eachChar <='z');

if(eachChar>='a' && eachChar<='z'){
    System.out.println("It is lowercase!");
}*/

//System.out.println("The End");


String allLowercaseStr = "";
for(int i = 0; i < str.length(); i++){
    //storing each character inside variable each
    //each iteration it will store that char
    char each = str.charAt(i);
    //checking whether this character at this iteration
    //is within the range of a-z
    if(each>='a' && each<='z'){
        allLowercaseStr+= each; //add on top of each other
        //System.out.println("It is lowercase!"+ each);
    }
}  
System.out.println(allLowercaseStr);


}
}