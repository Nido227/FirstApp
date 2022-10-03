package Assignent1;

public class Main {
    public static void main(String[] args) {

        //Creating new instances of Purchase.
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();

        //Assigning values to the methods of the Purchase Class/
        p1.setItemName("Nike Soccer Ball");
        p1.setItemPrice(50);
        p1.setQuantity(2);
        p2.setItemName("Adidas Jersey");
        p2.setItemPrice(100);
        p2.setQuantity(1);

        //Printing out the values of the methods in the Purchase Class.
        System.out.println(p1.getItemName());
        System.out.println(p1.getItemPrice());
        System.out.println(p1.getQuantity());
        System.out.println(p2.getItemName());
        System.out.println(p2.getItemPrice());
        System.out.println(p2.getQuantity());

        //Creating a new instances of PurchaseCollection.
        PurchaseCollection pc1 = new PurchaseCollection();
        PurchaseCollection pc2 = new PurchaseCollection();


        //Assigning values to the methods of the Purchase Class/
        pc1.set(1, p1);
        pc1.get(2);
        pc1.getSize();
        pc1.resize(5);
        pc1.makeCopy();
    }
    
}
