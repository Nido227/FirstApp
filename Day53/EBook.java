package Day53;

public class EBook extends Book{

    //SUB CLASS CAN HIDE SUPER CLASS'S FILED BY REDECLARING IT
    //THE ONLY THING THAT MATTER IS THE <NAME> 
    float name = 12.11f;
    long page = 100;
    //@Override ONLY FOR INSTANCE METHOD
    private static double weight = -1;

    public static void main(String[] args) {

        EBook e = new EBook();
        System.out.println(e.name);
        e.showValue();

    }

    public void showValue(){
        System.out.println(super.name + " --- " + this.name);
        System.out.println(super.page + " --- " + this.page);
        //static fields can be access directly in instance method
        //or we can make it obvious to call in static way Ebook.weight
        System.out.println(super.weight + " --- " + weight);

    }
}


//----------------
//we can have more than 1 calss in one source file
//however only one should be public


class Book{
    String name = "BookName";
    int page = 10;
    double weight = 5.0;

}