package cscLab1;

public class Main {
    public static void main(String[] args) {
        OrderedListArray ol;
        ol = new OrderedListArray();

        ol.show();
        System.out.println();

        ol.insertItem(10);
        ol.insertItem(20);
        ol.insertItem(30);
        ol.insertItem(40);
        ol.insertItem(50);
        ol.show();
    }
}
