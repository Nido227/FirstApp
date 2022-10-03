import java.util.Scanner;
public class ClassAndObject {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);    

String name = "Mamatjan";
System.out.println(name.length());
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());

char secondChar = name.charAt(2);
System.out.println(secondChar);

//contains
name.contains("am");
Object containsOrNot = name.contains("aam");
System.out.println(containsOrNot);

//indexOf
//return the index of first occurance of the string given
//if it does not exist it will return -1
System.out.println(name.indexOf("am"));
System.out.println(name.indexOf("t"));
System.out.println(name.indexOf("samatjan"));
System.out.println(name.indexOf("Mamatjan"));
System.out.println(name.indexOf("mamatjan"));

String uName = name.toUpperCase();
System.out.println(uName.indexOf("MAMATJAN"));

//optional
System.out.println(name.toUpperCase().indexOf("MA"));
//System.out.println(name.length().indexOf("MA"));



}    
}
