package Day49;

public class Device {
    int serialNum;

    public Device(){
        System.out.println("Device Constructor");
    }

    public Device(int serialNum){
        System.out.println("1 arg constructor");
        this.serialNum = serialNum;
    }
}
