package Day51;

public class AdminUser extends SlackUser{
    int adminLevel;

    public AdminUser(String displayName, int timeZone, 
    String status, int adminLevel){

        super(displayName, timeZone, status);
        this.adminLevel = adminLevel;

    }

    //@Override -- optional annotation to make sure you are overriding it correctly
    public void sendMessage(String message){
        System.out.println("@channel Dear good people of spartan" );
        System.out.println("<" + displayName + "> is sending <" 
        + message + ">");
    }

    public static void main(String[] args) {
        
        AdminUser a1 = new AdminUser("B11", 5, "Full Charged", 1);
        a1.sendMessage("abc");
    }



}
