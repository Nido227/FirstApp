package Day33;

import java.util.Arrays;

public class ReturningMultipleValie {
public static void main(String[] args) {

int[] myArr = giveMeAnArray();
System.out.println(Arrays.toString(myArr));

//Calling in one shot
System.out.println(Arrays.toString(giveMeAnArray()));

// Task 2 
double[] price1 = {1.1, 2.2, 3.3, 4.4};
double[] price2 = {5.5, 6.6, 7.7, 8.8};

double[] prices3 = combineArray(price1, price2);

System.out.println(Arrays.toString(price1) + (Arrays.toString(price2)));
}

// this method has no parameter and returns int array object as returned value
public static int[] giveMeAnArray(){
int[] arr = new int[] {1,2,3};

return arr; 
}

//Task 2
public static double[] combineArray(double[] d1, double[] d2) {
double[] arrCombined = new double[d1.length + d2.length];



return arrCombined;
}


}
