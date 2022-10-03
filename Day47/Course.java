package Day47;

public class Course {
    public static String school;
    public static boolean isRamadan;

    public Course(){
        System.out.println("Constructor");
    }

    //static initilizer block
    //it will ony run once when the Class is loaded
    //it is used to initialize the static fields value before
    //the types first usage and it'll run only 1 time before its usage

    //if you have more than one block 
    //it will run in the order it appears
    
    static {
        isRamadan = true;
        if(isRamadan){
            System.out.println("Use Ramadan schedule");
        }else {
            System.out.println("Use regular scehdule");
        }
    }

    static {
        school = "CyberTek School";
        System.out.println("Welcome to our school: " + school);
        System.out.println("let the journey begin");
    }



}
