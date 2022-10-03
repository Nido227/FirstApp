package cscLab1;

public class OrderedListArray {
    int[] info;
    int length;

    public OrderedListArray() {
        info = new int[10];
        length = 0;
    }

    public void insertItem(int data){
        info[length] = data;
        length++;
    }

    public void show(){
        if(length ==0){
            System.out.println("List is empty");
            return;
        }

        for (int i = 0; i < length; i++) {
            System.out.println(info[i]);
        }
    }
}
