package Day30;

public class Warmup {

public static void sayHello(){
    System.out.println("Greetings Spartans!");
}

public static void sayGoodbye(){
    System.out.println("Bye Spartans");
}
private static void sayHelloTo(String name){
System.out.println("Greetings, " + name);
}


public static void main(String[] args) {
    sayHello();
    sayHello();

// Calling static method
    // ClassName.staticMethidName();
    // if the method is in the same class --> staticMethodName();
Warmup.sayGoodbye();
sayHelloTo("300 Spartans");
sayHelloTo("Jon Snow");

}



}
