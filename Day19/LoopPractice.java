package Day19;
import java.util.Scanner;
public class LoopPractice {
public static void main(String[] args) {

//ask user a word
//for example Bilal ----> B-i-l-a-l-

Scanner scan = new Scanner(System.in);

String name = "Bilal";

System.out.print(name.charAt(0)+"-");
System.out.print(name.charAt(1)+"-");
System.out.print(name.charAt(2)+"-");
System.out.print(name.charAt(3)+"-");
System.out.print(name.charAt(4)+"-");

System.out.println();

//using loop 

int x = 0;
while(x<5){
    System.out.print(name.charAt(x++)+ "-");
    //x++;
}

//input user name
System.out.println();
System.out.print("Please enter a name: ");
String name1 = scan.nextLine();

//int y = 0;
//while(y < name1.length())
//System.out.print(name1.charAt(y++)+ "-");


//task 3: reverse ur name, using above code
System.out.println();
int count = name1.length();
String reverse = "";
while(count>0){
    
    //System.out.print(name1.charAt(count-1) + " ");
    count--;
    reverse = reverse + name1.charAt(count); }
    //count--;
    //System.out.print(name1.charAt(count) + " ");
    System.out.println("Palindrome "+name1.equals(reverse));

//CREATE PROGTAM TO CHECK IF A WORD IN PAINDROM


    



}
}    

