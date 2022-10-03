package Day35;
import java.util.jar.Attributes.Name;

public class MethodOverloading {
public static void main(String[] args) {

// Can I use same method name for different methods?
// Yes! This is called MethodOverloading
// Definition: reusing the name of the method with different method parameters
// You can have method with different parameter count/type or both


printName();
printName("Java");
printName("Java ", "Spartan");
printName(300);
System.out.println();

}

public static void printName() {
System.out.println("no arg print name");
}

public static void printName(String name) {
System.out.println("1 string arg print name" + name);
}

public static void printName(int num) {
System.out.println("1 int arg print name" + num);
}

public static void printName(String firstName, String lastName) {
System.out.println("2 string arg print name" + firstName+lastName);
}




}
