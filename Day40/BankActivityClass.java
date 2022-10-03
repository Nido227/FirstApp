package Day40;

public class BankActivityClass {
public static void main(String[] args) {

BankAccount customer1 = new BankAccount();
customer1.accountHolder = "Nido";
customer1.balance = 450.25;

System.out.println("------Customer 1------");

customer1.showAccountHolder();
customer1.showBalance();
customer1.add100dollar();
customer1.showBalance();
customer1.addDollar(300);
customer1.showBalance();

BankAccount customer2 = new BankAccount();
customer2.accountHolder = "Taha";
customer2.balance = 00.50;

System.out.println("------Customer 2 ------");

customer2.showAccountHolder();
customer2.showBalance();
customer2.add100dollar();
customer2.showBalance();
customer2.addDollar(525);
customer2.showBalance();





}








}
