import java.util.Scanner;
public class SearchForJavaVerifySearrchResult {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

//About 813,000,000 results in (0.56 seconds)

String str = "About 813,000,000 results in (0.56 seconds)" ;

//how to get certain part of string
//if(str.indexOf("About")==0){

if (str.substring(0,5).equals("About") && str.contains("results")){
    System.out.println("it pass.");
}else{

    if(!str.subSequence(0, 5).equals("about")){
        System.out.println("about did not start in the beginning");
    }else if(! str.contains("results")){
        System.out.println("does not contain word result");
    }
    System.out.println("it fail.");
}



}
}   
