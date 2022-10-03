package Day31;
import java.util.Scanner;
public class MethodWithMoreParams {
public static void main(String[] args) {
login("Nido", "pass1", true);
login("horse", "p300", false);


}

public static void login(String username, String password, boolean rememberMe) {
Scanner scan = new Scanner(System.in);
System.out.println("Entered username: "+ username);
System.out.println("Entered password: "+ password);
if(rememberMe ==true) {
    System.out.println("You account info is saved.");
}else {
    System.out.println("Account info will not be saved. ");
}

}


}
