public class Purchase {
    
    //member member variables for itemName (string), quantity (double), itemPrice (double).
    private String itemName;
    private double quantity;
    private double itemPrice;

    //creating a default constructor
    public Purchase() {
        this.itemName = "";
        this.quantity = 0;
        this.itemPrice = 0;
    }

    //Creating a constructor that takes values for all member variables as parameters.
    public Purchase(String itemName, double quantity, double itemPrice) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    //Creating a copy constructor for instance values.
    Purchase(Purchase other) {
        this.itemName = other.getItemName();
        this.quantity = other.getQuantity();
        this.itemPrice = other.getItemPrice();
    }

    //Implementing get/set methods for all member variables.
    String getItemName() {
        return itemName;
    }

    void setItemName(String itemName) {
        this.itemName = itemName;
    }

    double getQuantity() {
        return quantity;
    }

    void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    double getItemPrice() {
        return itemPrice;
    }

    void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    //Implementing the cost method. multiply the itemPrice by the quantity and returning that value.
    double cost() {
        return (quantity * itemPrice);
    }

    //Creating a makeCopy method (DEEP COPY).
    Purchase makeCopy() {
        return new Purchase(this);
    }

    //Implementing an equals override. Returning value based on the "values".
    public boolean equals(Object o) {

        //Returns true.
        if (o == this) {
            return true;
        }

        //Returns false.
        if (!(o instanceof Purchase)) {
            return false;
        }

        Purchase p = (Purchase) o;
        //Comparing the data members and the returns.
        return (p.getItemName().compareTo(itemName) == 0) && (p.getQuantity() == quantity)
                && (p.getItemPrice() == itemPrice);
    }
}
