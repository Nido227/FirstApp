package Day43;

public class Product {

private String name;
private float rating;
private double price;
private String productID;

//create a method to set the value of all fields
//
public void initializeAllFieldValue(String name, float rating, double price, String productID){

this.name = name;
this.rating = rating;
this.price = price;
//this.productID = productID;
//optionally
//you can do abobe by calling setter method
setProductID(productID);
}


public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public float getRating() {
    return rating;
}
public void setRating(float rating) {
    this.rating = rating;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public String getProductID() {
    return productID;
}
public void setProductID(String productID) {
    this.productID = productID;
}




}
