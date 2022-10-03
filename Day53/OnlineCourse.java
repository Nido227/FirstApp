package Day53;

public class OnlineCourse extends Course{

    int capacity = 300;

    public void showCapacity(){

        //As long as you have a field called capacity in this calss
        //below line will always be ineterpreted as this.capacity
        System.out.println("Capacity directly " + capacity);
        System.out.println("Online course " + this.capacity);
        System.out.println("Course " + super.capacity);

    }







}
