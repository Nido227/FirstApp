package Day56;

//implementing a interace also building a parent child relationship
//we use implements keyword rather than extends used by a class
//the class must implements every abstract method

public class OnlineStudent implements Teachable{

	@Override
	public void canLearn() {
        System.out.println("can learn by hardwork");
	}

	@Override
	public void doHomework() {
        System.out.println("will do all the hw");
	}

    public static void main(String[] args) {
        
        System.out.println(Teachable.STUDY_HARD);
        System.out.println(STUDY_HARD);

        OnlineStudent o = new OnlineStudent();
        o.canLearn();
        o.doHomework();
    }
    
    
}
