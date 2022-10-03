package Day53;

public class UKOnlineCourse extends OnlineCourse{

    int capacity = 200;

    public static void main(String[] args) {

    /*
     * Course > OnlneCourse > UK_OnlineCourse
     */

        UKOnlineCourse sdet = new UKOnlineCourse();
        // System.out.println(sdet.capacity);
        sdet.showCapacity();

    }

    @Override
    public void showCapacity(){

        //As long as you have a field called capacity in this calss
        //below line will always be ineterpreted as this.capacity
        System.out.println("Capacity directly " + capacity);
        System.out.println("UK_Online course " + this.capacity);
        System.out.println("OnlineCourse " + super.capacity);

        System.out.println("----------------");
        super.showCapacity();

    }







}
