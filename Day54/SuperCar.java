package Day54;

import javax.management.modelmbean.ModelMBean;

public class SuperCar {
    final String mode;
    final String make;
    final Engine engine;

    public SuperCar(String mode, String make, Engine engine) {
        this.mode = mode;
        this.make = make;
        this.engine = engine;
    }

    
    public void start(){
        //calling Engine's start method
        engine.start();
        System.out.println("Super Car MAKE " + make + " MODEL: " + 
        mode + " with engine cyliner count " + engine.cylinderCount);
    }
    
    public static void main(String[] args) {
        Engine e1 = new Engine("turbo", 6);
        e1.start();

        SuperCar spartanHorse = new SuperCar("SpartanHorse", "CybertTek", e1);
        System.out.println(spartanHorse);
        spartanHorse.start();


    }






}
