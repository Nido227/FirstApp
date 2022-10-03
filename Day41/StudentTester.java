package Day41;

import Day40.BankAccount;

public class StudentTester {
public static void main(String[] args) {

Student nido = new Student();
nido.name = "Nido";
nido.age = 21;
nido.ssn = 1234567;

nido.displayName();

//nido.displayNameAndAge();
//nido.showSSN();

BankAccount acc1 = new BankAccount();
System.out.println(acc1.balance);
acc1.add100dollar();
System.out.println(acc1.balance);





}    












}
