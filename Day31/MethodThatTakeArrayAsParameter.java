package Day31;

import java.util.Arrays;

public class MethodThatTakeArrayAsParameter {
public static void main(String[] args) {

/* Methods:
 * reuseable code, maintable code, write once and use it whenever needed
 * 
 * 3 questions to ask while creating a method:
 * 
 * does this method needs an object or not when being called
 * ---> if not we use static keyword
 * does this method take external data or not
 * --> if it doesn't we just end method name with empty ()
 * --> if yes put data type and name: parameters separated by a ,
 * does this method return a value after being called
 * --> if not, use void
 * --> if yes put the data type of the variable it returns
 * 
 */

String s = "abc";
System.out.println(s.charAt(0));

int arrObject[] = {1,2,5,6};
// Arrays.sort(arr);

// create a static method with no return type
// take one int array as parameter and print them out in one line with - in between


arrayPrinterWithDash( new int [] {1,2,3,6,5,5,65} );
arrayPrinterWithDash(arrObject);
System.out.println();

int[] arr1 = {1,2,3,4};
int[] arr2 = {10,20,30,40};

reportBiggerArray(arr1, arr2);
reportBiggerArray(new int[] {1,5,4} , new int[] {2,4});

}

public static void arrayPrinterWithDash(int manyItem[]) {
for ( int each : manyItem ) {
    System.out.print(each + "-");
}

}

// create a static void method called reportBiggerArray
// it will take 2 int arrays as parameter
// inside body with will compare the size of array
// and print out array with bigger size
// for example {1,2,3} {1,2,3,5} 
// ----> second array is bigger and print [1,2,3,5]

public static void reportBiggerArray(int[] arr1, int[] arr2) {
if (arr1.length > arr2.length){
    System.out.println(Arrays.toString(arr1));
}else{
    System.out.println(Arrays.toString(arr2));
}

}


}



