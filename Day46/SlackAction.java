package Day46;

import java.util.*;

public class SlackAction {
public static void main(String[] args) {

SlackUser s1 = new SlackUser();
System.out.println(s1.toString());
//below code will be seen as above code for compiler 
System.out.println(s1);

SlackUser s2 = new SlackUser("magiciain", "magic123@gmail.com",2);
SlackUser s3 = new SlackUser("engineer", "enginerr123@gmail.com",3);
SlackUser s4 = new SlackUser("teacher", "teacher123@gmail.com",4);

ArrayList <SlackUser> userList = new ArrayList<>();
userList.add(s1);
userList.add(s2);
userList.add(s3);
userList.add(s4);

for (SlackUser each : userList){
    System.out.println(each);
    each.sendMessage("general", "good morning");
}





}




}
