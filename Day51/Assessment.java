package Day51;

public class Assessment {
    int questionCount;
    int score;
    String type;

    //in our application all assessments have 1 shared timeLimit
    static int timeLimit = 45;

    public static void printTimeLimit(){
        System.out.println("Time limit: " + timeLimit);
    }

    @Override
    public String toString() {
        return "Assessment [questionCount=" + questionCount + 
        ", score=" + score + ", type=" + type + "]";
    }

    
}
