import java.util.Scanner;
public class nestedIf {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

String username = "user";
String password = "pass";
if(username.equals("user") && password.equals("pass")){
System.out.println("Login Successful. ");
}else{
    if(! username.equals("user")){
        System.out.println("Username Not Found! ");
    }else{
        System.out.println("Password not Correct! ");
    }
}



}
}
