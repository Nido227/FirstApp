package Day57;

import java.util.ArrayList;

public interface WebDriver {
    
    public static final String PURPOSE = "Automating Browser";

    public void openBrower();

    public void navigateTo();

    public void quit();

    String findElementByID(int id);

    ArrayList<String> findElementByTagName(String tagName);

    //DEFAULT METHOD
    //IT IS DEFINED USING DEFAULT KEYWORD
    //AND IT HAS BODY
    //WE CAN JUST INHERIT IT AS IT
    //or we can override to provide actual implementation
    public default void clickButton(String name){

        System.out.println("Do your implementation without breaking");
    }

    public default void clickButtonAndEnterText(){
        System.out.println("clickButtonAndEnter TEXT DO...");
    }

    public static void showPurpose(){
        System.out.println("purpose is:  " + PURPOSE);
    }

}
