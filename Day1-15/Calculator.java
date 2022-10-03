import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Please enter day number: ");

int dayNum = scan.nextInt();
String dayWord = "unknown";}}

/*switch (dayNum) {

case 1:
case 2:
case 3:
case 4:
case 5:
dayWord = "Weekdays";
break;

case 6:
case 7:
dayWord = "weekend";
break;

default:
dayWord = "invalid";

}
System.out.println("The day is: " + dayWord);

}} */


/*case 1:
    dayWord = "Monday";
    break;
case 2 : 
    dayWord = "Tuesday";
    break;
case 3 :
    dayWord = "Wednesday";
    break;
case 4 :
    dayWord = "Thursday";
    break;
case 5 :
    dayWord = "Friday";
    break;
case 6 :
    dayWord = "Saturday";
    break;
case 7 :
    dayWord = "Sunday";
    break;
default:
    dayWord = "Invalid Day!";
}

System.out.println("The day is: " + dayWord); */


/*int num1 = scan.nextInt();
int num2 = scan.nextInt();

System.out.println("Please enter an operator +, -, /, * :");
String operator = scan.next();

switch (operator) {
case "+":
System.out.println("The result is " + (num1 + num2));
break;

case "-":
System.out.println("The result is " + (num1 - num2));
break;

case "*":
System.out.println("The result is " + (num1 * num2));
break;

case "/":
System.out.println("The result is " + (num1 / num2));
break;

default:
System.out.println("Invalid Answer!");
} */


/*if(operator.equals("+")){
System.out.println("the result is " + (num1 + num2));
}else if (operator.equals("-")){
System.out.println("the result is " + (num1 - num2));
}else if (operator.equals("/")){
System.out.println("the result is " + (num1 / num2));
}else if (operator.equals("*")){
System.out.println("the result is " + (num1 * num2));
}else{
System.out.println("Invalid Answer!");
}*/

