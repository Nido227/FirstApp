package Day35;

public class MethodOverloading5 {
public static void main(String[] args) {

//add(10, 12);
//add(10L, 12L);
add(10d, (byte)12);

add(9, 10d);


}

public static void add(double a, int b) {
System.out.println("add (double a, int b) ");

}


public static void add(int a, double b) {
System.out.println("add (int a, double b) ");
       
}




}



