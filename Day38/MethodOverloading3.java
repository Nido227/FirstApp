package Day38;

public class MethodOverloading3 {
public static void main(String[] args) {

doSomething(4,3,4,3,4,3,4,3,4,3,4);
doSomething(4,3,1);
doSomething(4,3);
doSomething(5);

}

public static void doSomething(int x) {
System.out.println( "doSomething(int x)" );
}

public static void doSomething(int x, int y) {
System.out.println( "doSomething(int x, int y)" );
}

public static void doSomething(int... x) {
System.out.println( "doSomething(int... x)" );
}









}