package Day55Abstraction;

public class LocalStudent extends Student{

    int seatID;

    @Override
    public void attendClass(){
        System.out.println("Attending in classroom");
    }

    public LocalStudent(int id, String name, int seatID){
        super(id, name);
        this.seatID = seatID;
    }

}
