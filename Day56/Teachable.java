package Day56;

//Interface is a abstract type
public interface Teachable {
    
    //interface can only have constant and abstract method

    public static final boolean STUDY_HARD = true;
    //any field you have, automatically public static final
    String SCHOOL = "CyberTek";

    //any method without body or access modifier
    //its automatically public and absract
    public abstract void canLearn();

    //abstract method cannot be static
    public abstract void doHomework();


}
