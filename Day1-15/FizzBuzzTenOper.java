import java.util.Scanner;
public class FizzBuzzTenOper {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int num;
String result;

System.out.println("Please enter a value.");
num = input.nextInt();

//if(num % 5 == 0 && num % 3 == 0 ){
//  result = "fizzBuzz";
//}else{
//  result = "notfizzbuzz";}

result = (num % 5 == 0 && num % 3 == 0) ? "FizzBuzz" : "NotFizzBuzz";
System.out.println(result);

}
}
