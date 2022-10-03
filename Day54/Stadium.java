package Day54;

public class Stadium {
    int capacity;
    String food;


    public Stadium(int capacity, String food) {
        //super();
        this.capacity = capacity;
        this.food = food;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Stadium [capacity=" + capacity + ", food=" + food + "]";
    }

    









    
}
