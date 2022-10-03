package Day38;

public class MethodOverloadingSelectionOrder {
public static void main(String[] args) {

doSomething(10);


}


public static void doSomething(int x) {
System.out.println( "doSomething(int x)" );
}
    
public static void doSomething(long x) {
System.out.println( "doSomething(long x)" );
}

public static void doSomething(Integer x) {
System.out.println( "doSomething(Integer x)" );
}
    
public static void doSomething(int... x) {
System.out.println( "doSomething(int... x)" );
}



}