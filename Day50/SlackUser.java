package Day50;

public class SlackUser {
    String displayName;
    int timeZone;
    String status;

    public SlackUser(){
        System.out.println("SlackUser no arg constructor");
    }

    public SlackUser(String displayName, int timeZone, String status) {
        this.displayName = displayName;
        this.timeZone = timeZone;
        this.status = status;
    }

    public void sendMessage(String message){
        System.out.println("<" + displayName + "> is sending <" 
        + message + ">");
    }

    public void changeStatus(String status){
        this.status = status;
    }






}