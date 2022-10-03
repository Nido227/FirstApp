package Day40;

public class PhoneFactory {
public static void main(String[] args) {
        
Phone iPhone = new Phone();
iPhone.brand = "Apple";
iPhone.OS = "IOS";
iPhone.capacity = 128;
iPhone.ring();
iPhone.dial();
iPhone.displayBrand();

System.out.println(iPhone.OS);
    
    
Phone Samsung = new Phone();
Samsung.brand = "Samsung";
Samsung.OS = "Andriod";
Samsung.capacity = 200;
Samsung.ring();
Samsung.dial();
Samsung.displayBrand();

System.out.println(Samsung.brand);
    
    
Phone Pixel = new Phone();
Pixel.brand = "Google";
Pixel.OS = "Google OS";
Pixel.capacity = 158;
Pixel.ring();
Pixel.dial();
Pixel.displayBrand();

System.out.println(Pixel.capacity);




}






}
