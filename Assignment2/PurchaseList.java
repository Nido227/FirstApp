import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class PurchaseList {
    private List<Purchase> purchases;

    //Creating a deafult constructor.
    public PurchaseList() {
        purchases = new LinkedList<>();
    }

    //Implementing a copy constructor.
    public PurchaseList(PurchaseList other) {
        purchases = new LinkedList<>();
        List<Purchase> lst = other.getPurchases();
        for (Iterator i = lst.iterator(); i.hasNext();) {
            purchases.add(((Purchase) i.next()).makeCopy());
        }
    }

    //Implementning add method.
    void add(Purchase p) {
        purchases.add(0, p);
    }

    //Implementing to add purchases from other purchase lists.
    void add(PurchaseList pl) {
        List<Purchase> lst = pl.getPurchases();
        for (Iterator i = lst.iterator(); i.hasNext();) {
            purchases.add(((Purchase) i.next()).makeCopy());
        }
    }

    //Implementing remove.
    Purchase remove(String itemName) {
        for (Iterator i = purchases.iterator(); i.hasNext();) {
            Purchase p = (Purchase) i.next();
            if (p.getItemName().equals(itemName)) {
                purchases.remove(p);
                return p;
            }
        }
        return null;
    }

    //Finding out the most expensive purchase that has been made.
    Purchase mostExpensivPurchase() {
        Purchase mostExpensive = null;
        double maxCost = 0.00;

        for (Iterator i = purchases.iterator(); i.hasNext();) {
            Purchase p = (Purchase) i.next();
            if (p.cost() > maxCost) {
                maxCost = p.cost();
                mostExpensive = p;
            }
        }
        return mostExpensive;
    }

    //Clearing out the lsit and making it empty.
    void makeEmpty() {
        purchases.clear();
    }

    //Finding out the length using .size().
    int getLength() {
        return purchases.size();
    }

    //Making a copy using makeCopy().
    PurchaseList makeCopy() {
        return new PurchaseList(this);
    }

    //Returning purchase list.
    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    //Overriding the equals method.
    public boolean equals(Object o) {
        //Return true
        if (o == this) {
            return true;
        }
        //Returns false
        if (!(o instanceof PurchaseList)) {
            return false;
        }

        PurchaseList pl = (PurchaseList) o;

        //Comparing the data members and returning.
        List<Purchase> lst = pl.getPurchases();

        if (lst.size() != purchases.size())
            return false;

        for (Iterator i = lst.iterator(), x = purchases.iterator(); x.hasNext() && x.hasNext();) {
            if (!((Purchase) i.next()).equals((Purchase) x.next()))
                return false;
        }
        return true;
    }

}
