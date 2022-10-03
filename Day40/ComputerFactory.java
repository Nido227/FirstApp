package Day40;

import java.util.*;

import javax.crypto.Mac;
import javax.imageio.ImageIO;

public class ComputerFactory {

public static void main(String[] args) {

Computer iMac = new Computer();
Computer MacPro = new Computer();

System.out.println("------iMac--------");

iMac.type = "Mac Desktop";
iMac.ram = 128;
iMac.screenSize = 16.5;
iMac.color = "White";
iMac.OS = "IOS";
iMac.isPersonal = true;


System.out.println(iMac.type);
System.out.println(iMac.ram);
System.out.println(iMac.OS);
System.out.println(iMac.screenSize);
System.out.println(iMac.isPersonal);


System.out.println("------MacPro------");

MacPro.type = "Mac Laptop Pro";
MacPro.ram = 128;
MacPro.screenSize = 18.5;
MacPro.color = "Silver";
MacPro.OS = "IOS";
MacPro.isPersonal = true;

System.out.println(MacPro.type);
System.out.println(MacPro.ram);
System.out.println(MacPro.OS);
System.out.println(MacPro.screenSize);
System.out.println(MacPro.isPersonal);

}
}
