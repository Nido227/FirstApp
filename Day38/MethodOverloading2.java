package Day38;

public class MethodOverloading2 {
public static void main(String[] args) {

Integer num = ( Integer.valueOf(100) );


//doSomething(num);
doSomething(100);
doSomething(Integer.valueOf(100));
doSomething(Integer.parseInt("100"));  //100 primitive value
//purpose of ---- .parseInt is turning String into a primitie value --------


//Can we set a Integer variable value to null?  YES!
// int x = null;  BAD IDEA! WONT WORK
Integer b = null;
doSomething(b);
doSomething(null);

}

public static void doSomething(Integer x) {
System.out.println( "doSomething(Integer x)" );
}





}
