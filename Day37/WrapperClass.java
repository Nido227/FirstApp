package Day37;

public class WrapperClass {
public static void main(String[] args) {

//Byte b = new Byte((byte)123);

printByteValue( (byte) 10);

byte b = 12;
printByteValue(b);

// upcasting / type widening
// 10 is literlly considered as int
// 10 -->> 10L and stored inside ong variable
long lval = 10;

// autoboxing --> 10L will become new Long(10L) as object and assigned to lRef
Long lRef = 10L;

// reference type does not care about the range
// it only care about the relationship between types
// range compatable assignment only works for primitive numbers
// Long lRef2 = new Integer(10);   THIS CODE DOES NOT WORK


// This always mislead programmer to think as below
// 10 --> 10L by type widening | or upcasting
// and then 10L autoboxed to Long Object
// BIG NO!!
// COMPILER IS LAZY --> IT ONLY TAKES ONE STEP
// FOR EXAMPLE: IT EIITHER ONLY TAKE ACTION OF 
// 10 --> 10L   OR 10 --> New Integer(10)
// Common tricky exam | interview questions
// Long lRef3 = 10;

Double d = 3.14;  // autoboxing

// compiler cannot turn int 3 into Doube object in one step, compiler is onlu willing to take one step.
//Double badD = 3;  //not good

//Step 1: 3 --> 3.0d  //upcasting
//Step 2: 3.0d --> new Double(3.0d); //autoboxing

}


public static void printByteValue(byte b) {
System.out.println(b);

}







}
