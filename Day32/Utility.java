package Day32;

public class Utility {
public static void main(String[] args) {

String name = "Emine";
System.out.println(name.charAt(1));
char c = name.charAt(1);
System.out.println(c);

System.out.println(giveMe5());
System.out.println(Utility.giveMe5());

int myNum = giveMe5();
System.out.println(myNum);
}

public static int giveMe5() {
    return 5;

}



}
