package Day54;

public class FinalStaticFields {

    // public static final field = CONSTANT   :  always uppercase; highly recommended

    // FINAL STATIC FIELD VALUE MUST BE INITIALZED BEFORE CLASS FINISH LOADING
    public static final String RACE = "HUMAN";

static final int MAX_NUM = getStaticNum();

    private static final int MAX_SPEED ;
    static final String lowercase = "lower";

    static{
        MAX_SPEED = 120;
    }

    public static int getStaticNum(){
        return 200;
    }

    public static void main(String[] args) {

        System.out.println(RACE);
        System.out.println(MAX_SPEED);
        
        
        //RACE = "Humainoid";

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.PI);
    }
}
