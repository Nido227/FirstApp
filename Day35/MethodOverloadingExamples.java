package Day35;

public class MethodOverloadingExamples {
public static void main(String[] args) {

String name = "Java";
System.out.println( name.indexOf("a") );
System.out.println( name.indexOf("a",2) );
System.out.println( name.replace("a", "v") );

System.out.println("------------------");

System.out.println(addNums(1, 2));
System.out.println(addNums(3, 4, 5));
addNums(6, 7, 8, 9);
}

public static int addNums(int num1, int num2) {
return num1+num2;
}

public static int addNums(int num1, int num2, int num3) {
return num1+num2+num3;
}

public static void addNums(int num1, int num2, int num3, int num4) {
System.out.println(num1 + num2 + num3 + num4);

}



}
