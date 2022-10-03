package Day60;

import java.util.ArrayList;

public class Smart_TV extends TV{
    int channelCount = 200;

    public void play(){
        System.out.println("Playing smart");
    }

    @Override
    public int getChannelCount(){
        return channelCount;
    }

    public static void main(String[] args) {

        List<String> lst = new ArrayList<>()
        
        TV tv1 = new Smart_TV();
        System.out.println(tv1.channelCount);
        tv1.play();    //new SmartTV().play();
        System.out.println(tv1.getChannelCount());
        System.out.println(new Smart_TV().getChannelCount()) ;
    }
}
