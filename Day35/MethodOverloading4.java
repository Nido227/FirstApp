package Day35;

public class MethodOverloading4 {
public static void main(String[] args) {

double d ;

d = 10;
System.out.println(d);
d = 10L;
System.out.println(d);
d = 10F;
System.out.println(d);

release((byte)10);
release((short)10);
release(10L);
release(10F);
release(10.5);
release(15/2);
}

public static void release(double d) {
System.out.println("double " + d);
}


public static void release(int d) {
System.out.println("int " +d);
}

public static void release(float d) {
System.out.println("float " +d);
}

}
