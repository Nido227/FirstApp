package Day35;

public class MethodsOverloading3 {
public static void main(String[] args) {

int i = 10;

add(i);
add(10L);

}

public static void add(int x) {
System.out.println(" int x " + x);
}

public static void add(long x) {
    System.out.println(" long x " + x);
    }




}
