package Day55Abstraction;

public class OnlineStudent extends Student{

    public OnlineStudent(int id, String name, int zoomID){
        super(id, name);
        this.zoomID = zoomID;
    }
    
    int zoomID;

    @Override
    public void attendClass(){
        System.out.println("Attending in zoom");
    }

    public static void main(String[] args) {
        
        OnlineStudent s1 = new OnlineStudent(32, "Nido Ozl", 121212);
        // s1.id = 101;
        // s1.name = "Nido";
        // s1.zoomID = 112233;
        s1.attendClass();

        //Student s2 = new Student();


    }




}
