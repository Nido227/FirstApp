package Day37;

public class UsingWrapperClassType {
public static void main(String[] args) {

String str = "Spartan";

Integer i = 10;

// When we call this method, we need to pass an integer object as argument
// Since it returns an integer object, we can store them inside Integer ref variable
Integer a = giveMeInteger(new Integer(300));

// Since it returns an integer object, we can store them inside Integer ref variable
// If we store it in int variable it will auto unboxed into int value
int a1 = giveMeInteger(new Integer(300));

//When we call this method, we need to pass an intege object as argument
Integer a2 = giveMeInteger(Integer.valueOf(200));

// When we call this method, we need to pass an integer object as argumen
// if we pass primitive int, it will autobox into Integer object and pass as argument
Integer a3 = giveMeInteger(300);
}

// This is a method that has one Integer as parameter
// and returns an Integer object when being called
public static Integer giveMeInteger(Integer num) {

//return new Integer(10);
//return Integer.valueOf("10");
return 10;
}


public static String reverse(String name) {
return "some logic";   
}





}
