package Day41;

public class TeachAction {
   
public static void main(String[] args) {

Teacher akbar = new Teacher();
//field are private we cant access

//System.out.println(akbar.name());
//System.out.println(akbar.specalty());

akbar.setName("Akbar");
akbar.setSpecialty("Magic");

System.out.println(akbar.getName());
System.out.println(akbar.getSpecialty());

akbar.setName("MagicMan Spartan");
akbar.setSpecialty("Release magic horse");

System.out.println(akbar.getName());
System.out.println(akbar.getSpecialty());

}








}
