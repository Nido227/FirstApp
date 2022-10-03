package Day57;

import java.util.ArrayList;

public class ChromeDriver implements WebDriver{
    int screenSize;
    double positionX;

    //anytime i create a ChromeDriver object
    //it should automatically open the browser

    public ChromeDriver(int screenSize, double positionX) {
        this.screenSize = screenSize;
        this.positionX = positionX;
        openBrower();
    }

    public ChromeDriver(){
        System.out.println("Creating ChromeDriver with no arg");
        openBrower();
    }


    public static void main(String[] args) {

        ChromeDriver c1 = new ChromeDriver();
        c1.quit();
        ChromeDriver c2 = new ChromeDriver(5, 100);
        //c2.navigateTo("www.ndo.com");
        c2.findElementByID(100);
        c2.findElementByTagName("p");




    }

 
    @Override
    public void openBrower() {  
        System.out.println("Opening Browser");      
    }

    // @Override
    // public void navigateTo( String url) {     
    //     System.out.println("Naviagting to url" + url);   
    // }

    @Override
    public void quit() {   
        System.out.println("closing browser");     
    }

    @Override
    public String findElementByID(int id) {
        System.out.println("looking for elements hard with id " + id);
        return "my Element";
    }

    @Override
    public ArrayList<String> findElementByTagName(String tagName) {
        System.out.println("looking for all the elemnts with tagName " + tagName);
        ArrayList<String> allElements = new ArrayList<String>();
        allElements.add("first checkbox");
        allElements.add("another textbox");
        return allElements;
    }

    @Override
    public void navigateTo() {
        // TODO Auto-generated method stub
        
    }

    

}
