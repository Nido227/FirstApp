package Day31;

public class Calculator {
public static void main(String[] args) {
/* add two numbers        int
 * substract two numbers
 * multiply
 * divide
 * mod
 */


add(100, 30);
sub(100, 30);
mult(100, 30);
div(100, 30);
mod(100, 30);

}

public static void add(int num1, int num2) {
System.out.println("addition = " + (num1 + num2));
}
public static void sub(int num1, int num2) {
System.out.println("sub = " + (num1 - num2));
}
public static void mult(int num1, int num2) {
System.out.println("mult = " + (num1 * num2));
}
public static void div(int num1, int num2) {
System.out.println("div = " + (num1 / num2));
}
public static void mod(int num1, int num2) {
System.out.println("mod = " + (num1 % num2));
}







}
