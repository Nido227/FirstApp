package Day34;

public class VarArgs {
public static void main(String[] args) {

// Vararg --> variable number of arguments

// we are passing 2 external data (arguments) to a method that has 2 parameters
            // argument
add2Nummbers(10,12);
add3Nummbers(10,12,20);
      
addManyNumbers( new int[] {1,4,66,33} );
System.out.println("-----------------");
addManyNumbers2(1,4,5,6,7,8,9,90);
addManyNumbers2(1,4,5);
addManyNumbers2(1,4,5,6,7);
addManyNumbers2(1,4,1,34,45,56,678,879,345,234324,23);
}

                                // parameters
public static void add2Nummbers(int num1, int num2) {
    System.out.println(num1 + num2);
}
public static void add3Nummbers(int num1, int num2, int num3) {
    System.out.println(num1 + num2 + num3);
}

public static void addManyNumbers(int[] manyNums) {
int sum = 0;
for (int eachNum : manyNums) {
    sum+= eachNum;
}
System.out.println(sum);
}

//varArg -- is used to create a method that can take variable numbers of argument of same type when being called
// varArg parameter is represented by using ... after method parameter data type and IT CAN ONLY BE USED HERE!!!
public static void addManyNumbers2(int... manyNums) {
    // varArgs are seen exactly the same as an array inside method body
    int sum = 0;
for (int eachNum : manyNums) {
    sum+= eachNum;
}
System.out.println(sum);
}



}
