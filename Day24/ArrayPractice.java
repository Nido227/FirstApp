package Day24;
import java.util.Scanner;
public class ArrayPractice {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String names[] = {"Ahmet", "Batul", "Jovidon", "Emine", "Munire"};
System.out.println(names[2]);
System.out.println(names[names.length-1]);
System.out.println(names[4]);

names[2]= "Mubarek";
System.out.println(names[2]);

names[0] = "Nido";
System.out.println(names[0]);



}   
}
