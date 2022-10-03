package Assignent1;

public class Purchase {

//member member variables for itemName (string), quantity (double), itemPrice (double).
public String itemName;
public double quantity;
public double itemPrice;

//creating a default constructor
public Purchase(){ 
}

//Creating a constructor that takes values for all member variables as parameters.
public Purchase(String itemName, double quantity, double itemPrice) {
    this.itemName = itemName;
    this.quantity = quantity;
    this.itemPrice = itemPrice;
}

//Creating a new instance.
public Purchase(Purchase other){

//Copying instance values (Deep Copy).
this.itemName = other.itemName;
this.quantity = other.quantity;
this.itemPrice = other.itemPrice;
}

//Implementing get/set methods for all member variables.
public String getItemName() {
    return itemName;
}

public void setItemName(String itemName) {
    this.itemName = itemName;
}

public double getQuantity() {
    return quantity;
}

public void setQuantity(double quantity) {
    this.quantity = quantity;
}

public double getItemPrice() {
    return itemPrice;
}

public void setItemPrice(double itemPrice) {
    this.itemPrice = itemPrice;
}

//Implementing the cost method. multiply the itemPrice by the quantity and returning that value.
public double cost(){
    return itemPrice * quantity;
}

//Creating a makeCopy method.
public Purchase makeCopy() {
    return new Purchase(this);
}

//Implementing an equals override. Returning value based on the "values".
@Override
public boolean equals(Object other) {
    if (other == this) {
        return true;
    }

    if (!(other instanceof Purchase)) {
        return false;
    }

    Purchase c = (Purchase) other;

    return CharSequence.compare(itemName, c.itemName) == 0
            && Double.compare(itemPrice, c.itemPrice) == 0
            && Double.compare(quantity, c.quantity) == 0;
    }
}