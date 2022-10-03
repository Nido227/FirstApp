import java.util.Scanner;
public class WarmupDay13 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int num1 = 5;
int num2 = 8;

num1--;
num2++;

System.out.println("num1 : " + num1);
System.out.println("num2 : " + num2);

int max;
if(num1>num2){
    max = num1;
}else{
    max = num2;
}

max = (num1>num2) ? num1: num2 ;
System.out.println(   (num1>num2) ? num1: num2   );
System.out.println(10 + ((num1>num2) ? num1: num2));
System.out.println(10 + ((num1++>--num2) ? num1: num2));




/* int x = 71;
String result = "unknown";

result = (x>70) ? "pass" : "fail";
System.out.println((x>70) ? "pass" : "fail"); */


//s1.contrains("u");
//s1.indexOf("u");
//s1.substring(1,4);


}    
}
