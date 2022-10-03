package Day23_NestedLoop_Array;
import java.util.Scanner;
public class NestedLoop {
public static void main(String[] args) {
Scanner Scan = new Scanner(System.in);

//DRY PRINCIPLE
//DO NO REPEAT YOURSELF

for(int i = 1; i < 6; i++){
System.out.print(i + " ");
}
System.out.println();
for(int i = 1; i < 6; i++){
System.out.print(i + " ");
}
System.out.println();
for(int i = 1; i < 6; i++){
System.out.print(i + " ");
}
System.out.println();


//NESTED LOOP
for(int j = 0; j < 3; j++){

    for(int i = 1; i < 6; i++){
        System.out.print(i + " ");
    }
    System.out.println();
}

}
}