package Day24;
import java.util.Scanner;
public class ArrayTasks {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

// Create a char array that contains your name characters
// Using the 3 different ways

// 1
char[] myNameChar1 = new char[4];
myNameChar1[0] = 'N';
myNameChar1[1] = 'I';
myNameChar1[2] = 'D';
myNameChar1[3] = 'O';

//using FOR loop to print Array
for(int i = 0; i<4; i++){
    System.out.print(myNameChar1[i]);
}
System.out.println();

//2
char[] myNameChar2 = new char[] {'N', 'i', 'd', 'o'};
for(int i = 0; i < myNameChar2.length; i++){
    System.out.print(myNameChar2[i] + " ");
}
System.out.println();

//3... getting last index
char[] myNameChar3 = {'N', 'i', 'd', 'o'};
int count = myNameChar3.length;
    System.out.println("The last index of your name is: " + myNameChar3[count-1]);

//get middle index
int midIndex = count/2;
System.out.println("The middle index of your name is: " + myNameChar3[midIndex]);

//reversing Array
for( int x = count-1; x>=0; x--){
System.out.print(myNameChar3[x]+ " ");
}


System.out.println();



//reverse String
String str = "Nido";
String reverse = "";

for(int i = str.length()-1; i>=0; i--){
    reverse += str.substring(i, i+1);
}
System.out.println(reverse);




}
}    
