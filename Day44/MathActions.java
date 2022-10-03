package Day44;

import java.util.Arrays;

public class MathActions {
public static void main(String[] args) {

mathEquation math1 = new mathEquation(120,10, '+');
mathEquation math2 = new mathEquation(120,10, '-');
mathEquation math3 = new mathEquation(120,10, '*');
mathEquation math4 = new mathEquation(120,10, '/');

mathEquation[] arr = new mathEquation[] {math1,math2,math3,math4};
//OR
//mathEquation[] arr2 = {math1,math2,math3,math4};

for (mathEquation each : arr) {
    each.calculate();
    System.out.println(each.getResult());
    System.out.println(each);
}

System.out.println("----------------");
System.out.println(Arrays.toString(arr));




}




}
