package Assignment2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Creating an object of PurchaseLst called lstt.
        PurchaseLst lstt = new PurchaseLst();

        //Creating new instances of Purchase with different data.
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase("Soccer Ball");
        Purchase p3 = p2.makeCopy();
        Purchase p4 = new Purchase("Jersey");
        Purchase p5 = new Purchase("Shorts");

        //Adding instance data to collection, using .add method.
        lstt.add(p1);
        lstt.add(p2);
        lstt.add(p3);
        lstt.add(p4);
        lstt.add(p5);

        //Printing out all of the information.
        System.out.println("Item Name: " + p2.getItemName() + " Quantity: " + p2.getQuantity() + " Price: " + p2.getItemPrice() + " Total: " + p2.getItemPrice() * p2.getQuantity() + "\n");
        System.out.println("Purchase #1: ");
        System.out.println("Item Name: " + p2.getItemName() + " Quantity: " + p2.getQuantity() + " Price: " + p2.getItemPrice() + " ");
        System.out.println("Purchase #2: ");
        System.out.println("Item Name: " + p3.getItemName() + " Quantity: " + p3.getQuantity() + " Price: " + p3.getItemPrice() + " ");
        System.out.println("Purchase #3: ");
        System.out.println("Item Name: " + p4.getItemName() + " Quantity: " + p4.getQuantity() + " Price: " + p4.getItemPrice() + " ");
        System.out.println("Purchase #4: ");
        System.out.println("Item Name: " + p5.getItemName() + " Quantity: " + p5.getQuantity() + " Price: " + p5.getItemPrice() + " ");

        //Comparing purchases using overriden equals method
        if (p2.equals(p3)) {
            System.out.println("Purchase 1 & 2 are the same.");
        } else {
            System.out.println("Purchase 1 & 2 are not the same.");
        }
        if (p3.equals(p5)) {
            System.out.println("Purchase 2 & 4 are the same.");
        } else {
            System.out.println("Purchase 2 & 4 are not the same.");
        }

        // creating dummy purchase lstts using various constructors of the class
        PurchaseLst lstt2 = new PurchaseLst(lstt);
        PurchaseLst lstt3 = lstt.makeCopy();
        PurchaseLst lstt4 = new PurchaseLst();
        lstt4.add(new Purchase("Cleats", 11, 125));
        lstt4.add(new Purchase("HeadBand", 18, 15));

        // altering lstt 2
        lstt2.add(lstt4);
        Purchase removed = lstt2.remove("Jersey");
        if (removed == null)
            System.out.println(removed.getItemName() + " Error! Item has not found.");
        else
            System.out.println(removed.getItemName() + " has been removed.");

        // printing elements od all lstts
        System.out.println("Puchases in lstt 1:\nNumber of Purchase: " + lstt.getLength());
    
        for (Iterator i = lstt.getPurchases().iterator(); i.hasNext();) {
            Purchase p = (Purchase) i.next();
            System.out.println("Item Name: " + p.getItemName() + " Quantity: " + p.getQuantity() + " Price: " + p.getItemPrice());
        }

        System.out.println();
        System.out.println("Puchases in lstt 2: Number of Purchase: " + lstt2.getLength());
        
        for (Iterator i = lstt2.getPurchases().iterator(); i.hasNext();) {
            Purchase p = (Purchase) i.next();
            System.out.println("Item Name: " + p.getItemName() + " Quantity: " + p.getQuantity() + " Price: " + p.getItemPrice());
        }

        System.out.println();
        System.out.println("Puchases in lstt 3: Number of Purchase: " + lstt3.getLength());

        for (Iterator i = lstt3.getPurchases().iterator(); i.hasNext();) {
            Purchase p = (Purchase) i.next();
            System.out.println("Item Name: " + p.getItemName() + " Quantity: " + p.getQuantity() + " Price: " + p.getItemPrice());
        }

        System.out.println();
        System.out.println("Puchases in lstt 4: Number of Purchase: " + lstt4.getLength());

        for (Iterator i = lstt4.getPurchases().iterator(); i.hasNext();) {
            Purchase p = (Purchase) i.next();
            System.out.println("Item Name: " + p.getItemName() + "\nQuantity: " + p.getQuantity() + "\nPrice: " + p.getItemPrice() + "\n");
        }

        System.out.println();
        System.out.println("Most expensive Purchase in lstt 1: ");

        Purchase p = lstt.mostExpensivPurchase();
        if (p == null)
            System.out.println("Purchase lstt is Empty.");
        else
            System.out.println("Item Name: " + p.getItemName() + " Cost: " + p.cost());

        System.out.println("Most expensive Purchase in lstt 2: ");
        p = lstt2.mostExpensivPurchase();
        if (p == null)
            System.out.println("Purchase lstt is Empty.");
        else
            System.out.println("Item Name: " + p.getItemName() + " Cost: " + p.cost());

        // comparing lstts using the overriden equals method
        if (lstt.equals(lstt2)) {
            System.out.println("Purchase lstt 1 & 2 are equal.");
        } else {
            System.out.println("Purchase lstt 1 & 2 are not equal.");
        }
        if (lstt.equals(lstt3)) {
            System.out.println("Purchase lstt 1 & 3 are the same.");
        } else {
            System.out.println("Purchase lstt 1 & 3 are not same.");
        }

    }
}