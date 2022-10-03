import java.util.Scanner;
public class AmazonSearch {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.println("Enter items to seach for: ");
String itemToSeachFor = scan.nextLine();

System.out.println("You have entered : " + itemToSeachFor);

//Amazon.om : itemToSearchFor
String expectedResult = "Amazon.com :iPad" ;
String actualResult = "Amazon.com :" + itemToSeachFor;

if(expectedResult.equalsIgnoreCase(actualResult)){
    System.out.println("Test pass for ipad.");
}else{
    System.out.println("Test failed for ipad.");
}
    
}    
}
