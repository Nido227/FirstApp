package Day45;

//Calling a Constructor
/*
 * Where can we call it? When object is being created
 * a constructor can only be called inside another constructor of same class
 * RULE:
 * this(arg...)  use this keyword with paranthesis and pass arguments if needed
 * 1, it has to be in first statement of constructor body
 * 2, ONLY ONE CALL IS ALLOWED
 * 3, recursive constructor call is now allowed --COMPILER ERROR
 */

import java.util.Arrays;

public class Spartan {

String name;
int studyHour;
int horsePower;
boolean tired;
String[] certificates;

//this no arg constructor should set defualt value for name, studyHour, horsePower
public Spartan(){
    
this("No name", 5);

System.out.println("no arg");

// this.name = "No Name";
// this.studyHour = 5;

this.horsePower = 320;
//this.certificates = new String[] {"OCA,", "OCP"};
}


public Spartan (String name, int studyHour){
this.name = name;
this.studyHour = studyHour;
}


public Spartan (String name, int studyHour, int horsePower, 
boolean tired, String[] certificates){
this(name, studyHour);
// this.name = name;
// this.studyHour = studyHour;
this.horsePower = horsePower;
this.tired = tired;
this.certificates = certificates;
}



//create construcor that takes 1 arg boolean tired
//inside constructor call the constructor that takes 5 args
//to set all your default value
public Spartan (boolean tired){
    this("Nido", 3, 100, tired, new String[]{"salesforce"});

}
    



public String toString() {  //this is a method.. cannot call this(); bc its a constructor

//this();

    return "Spartan [certificates=" + Arrays.toString(certificates) + ", horsePower=" + horsePower + ", name=" + name
            + ", studyHour=" + studyHour + ", tired=" + tired + "]";
}



}
