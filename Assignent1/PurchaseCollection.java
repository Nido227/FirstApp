package Assignent1;

import java.lang.reflect.Array;

public class PurchaseCollection extends Purchase{
    
    //Creating a private member cariable that is an array of Purchase.
    private Purchase[] purchases;

    //Creating a default constructor
    public PurchaseCollection() {
        this.purchases = new Purchase[3];
    }

    //Creating a copy constructor (DEEP COPY) of parameter.
    PurchaseCollection(PurchaseCollection other) {
        this.purchases = other.purchases;
    }

    //Setting the value at the given index to the given purchase using void set.
    void set (int index, Purchase p){
        try
        {
            Array.set(this.purchases, index, p);
        }
        catch(NullPointerException e)
        {
            System.out.print("Index is not valid");
        }
    }

    //Returning the Purchase located at element index of the array, and returning null if index is not value.
    Purchase get (int index){
        try
        {
            return (Purchase) Array.get(this.purchases, index);
        }
        catch(NullPointerException e)
        {
            System.out.print("Index is not valid");
            return null;
        }
    }
    //Returning the number of elements in the Purchase array using int getSize().
    int getSize (){
        return this.purchases.length;
    }

    public PurchaseCollection makeCopy(){
        PurchaseCollection other = new PurchaseCollection();
        this.purchases = other.purchases;
        return other;
    }

    //Creating a new Purchase array that has the passed in size, using void resize(int newSize).
    void resize(int newSize){
        this.purchases = new Purchase[newSize];
    }

    @Override
    public boolean equals(Object o){
        if (o.equals(this)) {
            return true;
        }
    
        else {
            return false;
        }
    }
}