package Day52;

class data{
    static double num2 = 100;
}

public class initializerPractice {
    int a;
    String b;
    boolean c;
    double d;

    static{
        initializerPractice objz = new initializerPractice();
        objz.a=500;
    }

{
    a=30;
    b="cybertek";
    c=10 > 9;
    d=100_11;
}

static int a1;
static String b1;

static{
    a1=100;
    b1="CyberTek";
}


public static void main(String[] args) {
    initializerPractice obj = new initializerPractice();
    data d1 = new data();

    System.out.println(obj.a);
    System.out.println(obj.b);
    System.out.println(obj.c);
    System.out.println(obj.d);
    System.out.println(a1 + " " + b1);
    System.out.println(data.num2);
    System.out.println();

}





}
