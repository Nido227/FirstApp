package Day24;
import java.util.Scanner;
public class ScannerAndArrayMax {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);


int[] arr = new int[3];

for(int i = 0; i < arr.length; i++){
    System.out.println("Enter number "+(i+1));
arr[i] = scan.nextInt();
    System.out.println("The number you've entered is: " + arr[i]);
}

int min = arr[0];
for(int i = 0; i < arr.length; i++){
    if(arr[1] < min){
        min = arr[i];
    }
}

System.out.println("min value is: " + min);


}
}
