package Day50;

public class ExtremeSport extends Sport{
    
    @Override
    public void doSport(){
        System.out.println("extreme sports --- skydiving");
    }

    public static void main(String[] args) {

        ExtremeSport e1 = new ExtremeSport();
        e1.doSport();
    }
    
}
