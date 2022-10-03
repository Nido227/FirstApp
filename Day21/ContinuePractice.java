package Day21;
import java.util.Scanner;
public class ContinuePractice {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

//Task
//Print odd numbers 1-50

for(int x=1; x<=50; x++ ){
    System.out.print((x++) + " ");
}

System.out.println();

//task 2

int count =0; 

for(int x=1; x<50; x++){
    if(x%4==0){
        count = count +1;
    }  
}
System.out.println("count is: "+count);

//Task 3
int sum = 0;
for(int x=1; x<50; x++){
if(x%5==0 && x%3==0){
    continue;
}
System.out.print(x + " ");
sum = sum+x;
}
System.out.println(sum);




}
}    