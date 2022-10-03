package Day46;

public class SlackUser {

private String name;
private String email;
private int groupNum;

public SlackUser(){

    this("spartan", "spartan@cybertek.com", 1);

}


public SlackUser(String name, String email, int groupNum) {
    this.name = name;
    this.email = email;
    this.groupNum = groupNum;
}

//special method that used for getting String representation of an object
// it'll be automatically called when object is being printed using sysout
public String toString() {
    return "SlackUser [email=" + email + ", groupNum=" + groupNum + ", name=" + name + "]";
}

public void sendMessage(String channel, String content){
System.out.println(this.name + " Send message " 
+ content + " to channel " + channel );
}


public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public int getGroupNum() {
    return groupNum;
}
public void setGroupName(int groupName) {
    this.groupNum = groupNum;
}


}
