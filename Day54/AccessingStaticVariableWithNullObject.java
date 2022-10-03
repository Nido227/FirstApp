package Day54;

public class AccessingStaticVariableWithNullObject {
    
    public static void main(String[] args) {
        
        // SoccerFinal s1 = new SoccerFinal();

        // s1.printScore();
        // s1.printCupName();

        //static members does not need an object to be access
        //className.membername --static way should be used
        //non-static way works but not recommended
        SoccerFinal s2 = null;
        s2.printScore();
        s2.printCupName();
        System.out.println(s2.cupName);



    }


}
