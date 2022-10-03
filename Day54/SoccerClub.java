package Day54;

//HAS-A RELATIONSHIP CAN BE BUILD USING INSTANCE VARIABLE WITH REFERERENCE TYPE
//WHEN SoccerClub define has-a relationship with
//Stadium by putting Stadium as instance variable
//it has access to everything visible that Stadium object can have

//WHAT DO WE CALL HAS-A RELATIONSHIP COMPARED TO INHERITANCE FOR IS-A
//COMPOSITION COMMON INTERVIEW QUESTION
public class SoccerClub {

    int playerCount;
    String name;
    Stadium stadium;

    public SoccerClub(int playerCount, String name, Day54.Stadium stadium) {
        this.playerCount = playerCount;
        this.name = name;
        this.stadium = stadium;
    }

    public char getInitial(){
        return name.charAt(0);
    }

    public int getStadiumCapacity(){
        return stadium.capacity;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    @Override
    public String toString() {
        return "SoccerClub [name=" + name + ", playerCount=" + playerCount + ", stadium=" + stadium + "]";
    }

    
    public static void main(String[] args) {

        Stadium s1 = new Stadium(10000, "Kebab");

        System.out.println(s1.toString());

        SoccerClub c1 = new SoccerClub(23, "Nido FC", s1);

        System.out.println(c1.toString());
        System.out.println(c1.getInitial());
        System.out.println(c1.getStadiumCapacity());
    }








}
