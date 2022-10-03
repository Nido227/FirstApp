package Day54;

public class ProgrammingLanguage extends Language{

    public static void main(String[] args) {
        
    }

}

//     @Override
//     public void obeyGrammarRule(){
//         System.out.println("Are you sure?");
//         super.obeyGrammarRule();
//     }

class Language{

    public final void obeyGrammarRule(){
        System.out.println("Must obey syntax rule");

    }

    public final static void display(){
        System.out.println("display language");
    }

}

