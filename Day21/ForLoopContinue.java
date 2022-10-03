package Day21;
import java.util.Scanner;
public class ForLoopContinue {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

for (int i = 1; i<=10; i++){
    System.out.print(i + " ");
}
System.out.println();

/*int j = 1;
for ( ; j<=10;){
    j++;
    System.out.print(j + " "); */


for(int i=1 ; i<=10; i+=2){
System.out.print(i+" ");
}



}   
}
