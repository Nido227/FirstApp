package Day28;

import java.util.Arrays;

public class ForEachLoopModiftyItem {
public static void main(String[] args) {

// FOR EACH LOOP SHOULD NEVER BE USED TO MODIFTY ARRAY ITEMS

int a = 10;
int b = a;
b = 20;

System.out.println(a);

int [] arr = {1,2,4,6,3};
for (int k = 0; k < arr.length; k++) {
int eachItem = arr[k];
eachItem=20;

}
System.out.println(Arrays.toString(arr));

for (int eachItem : arr) {
    eachItem=20;
    
}
System.out.println(Arrays.toString(arr));






}
}
