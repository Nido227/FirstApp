package Day40;

public class BankAccount {

//2 instance variable / fields
String accountHolder;
public double balance;


public void showAccountHolder() {
System.out.println("Account holder name is: " + accountHolder);
}

public void showBalance() {
System.out.println("Account balance is: " + balance);
}

// adding 100 dollar to current balance
public void add100dollar() {
balance = balance + 100;
}

//adding x dollar to current balance
public void addDollar(int amount) {
balance = balance + amount;
}


//Create a instance methid ( non-static method)
//called showAccountHolder ---> printOut Account Holder name

//create a instance method showBalace accept no parameter and return nothing, and print out the balance

//OPTIONAL
//create an instance method called add100Dollar does not accept any parameter and returns no value
//increase the balance of the account by 100

//Create another class called BankActivity with main method
//create bank account object
//set account holder name and balance value
//call your showAccountHolder and showBalance method
//OPTIONALLY CALL YOUR add100D








}
