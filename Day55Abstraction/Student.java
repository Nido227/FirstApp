package Day55Abstraction;

//abstract class are not meant to be instantiated* --NO OBJECT !
//abstract class are meant to be a super class
// to provide a general idea, without providing the implementation detail..
//..using abstract method

//OTHER THAN ABOVE 
//YOU CAN HAVE EVERYTHING ELSE A NORMAL CLASS CAN HAVE

public abstract class Student {

    int id;
    String name;
    public static final String SCHOOL = "CyberTek";

    //we can have constructor in abstract class
    //sole purpose is to to provide reuseable code for sub-class constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //we can have non-abstract instance method
    //sub class have option to directly use it
    //or it has option to override the method
    public void study(){
        System.out.println("Study hard to get the job");
    }

    //can have static method
    //sub class option to use as it
    //or hide it with same method

    //static method can not be abstract AT ALL !!
    public static void showSchool(){
        System.out.println(SCHOOL);
    }

    //abstract method can be defined only in abstract class
    //it must have keyword abstract
    //and it must not have body
    //it ends with < ; >
    public abstract void attendClass();

    // public void attendClass(){
    //     System.out.println("Implement in Sub Classes");
    // }
    





}
