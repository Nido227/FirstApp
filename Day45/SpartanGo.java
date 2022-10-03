package Day45;

public class SpartanGo {
public static void main(String[] args) {

Spartan s1 = new Spartan();
System.out.println(s1);

String[] certs = {"OCA", "PSM", "AWS", "OCP"};

Spartan s2 = new Spartan("Coder", 8, 600, false, certs);
Spartan s3 = new Spartan("Coder2", 7, 500, false, new String[] {"OCA"});
Spartan s4 = new Spartan("Coder3", 6, 400, false, new String[] {});
Spartan s5 = new Spartan("Coder4", 6, 300, false, null);


//we are printing object directly
System.out.println(s2);

//compiler automatically do this
System.out.println(s2.toString());

System.out.println(s3);
System.out.println(s4);
System.out.println(s5);




}
}
