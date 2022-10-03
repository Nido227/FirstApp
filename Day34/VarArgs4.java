package Day34;

public class VarArgs4 {
public static void main(String[] args) {

// VarArgs is represented in method parameter using ...
/*
 *... CAN ONLY BE USED AS METHOD PARAMETERS 
 * IT CAN NOT BE USED ANYWHERE ELSE
 * 
 * Calling a method that have VarArg
 * we directly pass variable number of arguments
 * You may also pass an array --(not so common but possible)
 * 
 * What if you have more than 1 Parameter in method???
 */

doSomething("magic horse", 2);

}

public static void doSomething(String name, int... nums) {
System.out.println("do something was called");
}

// If there are multiple parameters, the VarArg has to be the last one

// You cannot have multiple VarArgs, 1 per method

// A method that takes VarArgs as parameter can accept an array object as a argument

}
