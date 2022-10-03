package Day44;

//POJO  --> PLAIN OLD JAVA OBJECT

/* It has private fields to represent objecs attribute
 * it has public getters and setters
 * it has constructors to set all the field value
 * it has toString method to return String representation of the object in nice format with all field value
 */

public class House {

private String type;
private int bedRoom;
private double price;


public House(String type, int bedRoom, double price) {
    this.type = type;
    this.bedRoom = bedRoom;
    this.price = price;
}


public String getType() {
    return type;
}
public void setType(String type) {
    this.type = type;
}
public int getBedRoom() {
    return bedRoom;
}
public void setBedRoom(int bedRoom) {
    this.bedRoom = bedRoom;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}

public String toString() {
    return "House [bedRoom=" + bedRoom + ", price=" + price + ", type=" + type + "]";
}




}