package Day51;

public class AtTheTeller {
    public static void main(String[] args) {
        
        SavingAccount s1 = new SavingAccount("Ashraf", 12345, 11000, 2.3);
        System.out.println(s1.toString());
        s1.deposit(1);
        System.out.println("Current amount: " + s1.balance);
        s1.deposit(1);
        System.out.println("Current amount: " + s1.balance);
        s1.withdraw(10000);
        System.out.println("Current amount: " + s1.balance);

    }
}
