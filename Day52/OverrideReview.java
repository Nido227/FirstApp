package Day52;

class test1{
    public void method1(){
        System.out.println("A");
    }
    public final static void method2(){

    }
    private void method3(){

    }

}






public class OverrideReview extends test1{
     
    @Override  //check if the method is being override or not
    public void method1(){
        System.out.println("B");
    }

//Override: method needs to be override in the subclass cannot overide a methods within the class







}


