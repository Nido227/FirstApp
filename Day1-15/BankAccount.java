import java.util.Scanner;

public class BankAccount {
public static void main(String[] args) {
    
Scanner scan = new Scanner(System.in);

System.out.println("Welcome to the CyberTek Banking App!");

long accountNumber = 123456789L;
String password = "password";

System.out.println("Please enter account number: ");
long enteredNumber = scan.nextLong();
scan.nextLine();


System.out.println("Please enter password:");
Long enteredPassword = scan.nextLong();

if(enteredNumber == accountNumber && enteredPassword.equals(password)){
System.out.println("Successful Login.");
}else{
    System.out.println("Login Error.");
}

}
}
