package Day18;
import java.util.Scanner;
public class GiveMeSum {
public static void main(String[] args) {
Scanner scan = new Scanner (System.in);

//how do you get the sum of number
//starting from 1 till designed number
//user input 5--> 1+2+3+4+5 = 15

int sum = 0;
//1+0 = 1
//2+1 = 3
//3+3 = 6

int count = 1;

while(count<=5);{

sum = sum + count;
System.out.println("Current sum: " + sum + " count is " + count);
//System.out.println(count);
count++;
}

System.out.println(sum);
}
}
