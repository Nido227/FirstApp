package Day42;

public class CopyingA_VariableValue {
public static void main(String[] args) {
    
Dog d1 = new Dog();
d1.name = "Puppy";
d1.breed = "pitbull";

Dog d2 = d1;
d2.name = "Roma";


System.out.println(d1.name);

d2 = new Dog();
d2.name = "Mila";

System.out.println(d1.name);
System.out.println(d2.name);


}







}
