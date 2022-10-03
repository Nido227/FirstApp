package Day27;
import java.util.Arrays;
import java.util.Scanner;
public class CommonArrayTask {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

// ASK USER TO ENTER 5 NUMBERS
System.out.println("Please enter 5 numbers. ");
int[] numbers = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(),};

System.out.println(Arrays.toString(numbers));

//FINDING THE SUM
int sum = 0;
 
for(int num : numbers){
    sum = sum + num;
}
System.out.println("Sum is: "+ sum);

//FINDING THE MAX
int max = numbers[0];

for( int eachNum:numbers ){
    if(eachNum>max){
        max = eachNum;
    }
}
System.out.println("Max is: "+ max);

//FINDING THE MIN
int min = numbers[0];
for( int eachNumber:numbers ){
    if(eachNumber<min){
        min = eachNumber;
    }
}
System.out.println("Min is: "+ min);



}   
}
