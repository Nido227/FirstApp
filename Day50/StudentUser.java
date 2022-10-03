package Day50;


public class StudentUser extends SlackUser{
    int groupNum;

    public StudentUser(){
        //super();

        System.out.println("Student user no arg");
    }

    public StudentUser(String displayName, int timeZone, String status, int groupNum) {
        super(displayName, timeZone, status);
        // this.displayName = displayName;
        // this.timeZone = timeZone;
        // this.status = status;
        this.groupNum = groupNum;
    }

    @Override
    public String toString() {
        return "StudentUser [groupNum=" + groupNum + ", displayName=" 
        + displayName + ", timeZone =" + timeZone +", status=" 
        + status + "]";
    }

    public static void main(String[] args) {
        StudentUser s1 = new StudentUser();
        StudentUser s2 = new StudentUser("Nido", 6, "available", 2);
        System.out.println(s2);
    }

  



    
}