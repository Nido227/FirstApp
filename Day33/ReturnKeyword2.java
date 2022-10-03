package Day33;

public class ReturnKeyword2 {
public static void main(String[] args) {

// Break vs Return
// break: we can only use it inside switch and loop
// return: exclusively used to return a value or terminate method execution

ageTester(15);

System.out.println(isAdultOrNot(12));

}

public static boolean isAdultOrNot(int age){
if (age < 18){
    System.out.println("Not adult.");
    return false;
}
return true;
}

public static void ageTester(int age) {
    
if( age <18){
    System.out.println("Not adult.");
    return;  //once the return keyword is reached it will exit the method
}    
System.out.println("go to work");
System.out.println("get paid");
System.out.println("pay ur bill");
}





}
