package Day31;

public class Warmup {
public static void main(String[] args) {
countFrom1to10();

countFrom1ToN(6);
countFrom1ToN(16);

countDown(20);



}

public static void countFrom1to10() {
for (int i = 0; i <=10; i++) {
    System.out.print(i + " ");
}
    System.out.println();
}

public static void countFrom1ToN(int n) {
//int n = 5;
for (int i = 1; i <= n; i++) {
    System.out.print(i + " ");
}
    System.out.println();  
}

public static void countDown(int n) {
//int n = 7
for (int i = n; i >= 1; i--) {
    System.out.print(i + " ");
}
    System.out.println();
}



}
