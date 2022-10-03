package Day22;
import java.util.Scanner;
public class UsingLoopForSearchingIndex {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String str = "ABCAA";

//TASK 1:
// Loop through each charcter using Substring
//and print them out with - inbetween

/*System.out.println(str.substring(0,1));
System.out.println(str.substring(1,2));
System.out.println(str.substring(2,3));
System.out.println(str.substring(3,4)); 
System.out.println(str.substring(4,5)); 
*/

for(int i = 0; i<str.length(); i++){

    String eachChar = str.substring(i, i+1);

    if(i!=str.length()-1)
        System.out.print(eachChar + "-");
    else
        System.out.print(eachChar);

    //ternary
        //System.out.print(eachChar + ( (i != str.length()-1) ? "-" : "") );
}


}    
}
