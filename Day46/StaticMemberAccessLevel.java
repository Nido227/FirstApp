package Day46;

public class StaticMemberAccessLevel {

static int staticVar;
static int instanceVar;

public static void main(String[] args) {
    
System.out.println(staticVar);
// int num2 = 0;
// System.out.println(num2++);

//instanceVar is instance variable
// we cannot access any instance member in static method
// System.out.println(instanceVar);

StaticMemberAccessLevel s1 = new StaticMemberAccessLevel();
System.out.println(s1.instanceVar);
    
}

//what can we access inside instance method
//any instance field static field
//any instance method static method can be accessible
public void doSomething(){

System.out.println("inside instance method " );    
System.out.println("instance variable" + instanceVar);
System.out.println("static varible " + staticVar);

}

//what can we access inside static method
//no object needed when we call this method
//static method ONLY CAN ACCESS STATIC MEMBERS!

public static void doStaticThing(){
System.out.println("inside static method " );    
System.out.println("instance variable: " + instanceVar);
System.out.println("static varible " + staticVar);

}



}
