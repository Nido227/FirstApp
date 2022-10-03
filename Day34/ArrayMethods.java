package Day34;

import java.util.Arrays;

public class ArrayMethods {
public static void main(String[] args) {

int x = 15;
int[] resultArr = getArrayFrom1toX(x);
System.out.println(Arrays.toString(resultArr));

// turn this result into String outside
String arrInString = Arrays.toString( getArrayFrom1toX(7) );
System.out.println(arrInString);

System.out.println(Arrays.toString(getArrayFrom1toX(17)));
}

public static int[] getArrayFrom1toX(int x) {
int[] arr = new int[x];
for (int i = 0; i < arr.length; i++) {
arr[i] = i+1;
}
return arr;

}





}