package Day43;

public class ProductExplorer {
public static void main(String[] args) {

Product p1 = new Product();
p1.initializeAllFieldValue("Watch", 4.5f, 113.39, "x123");

System.out.println(  p1.getName()  );
System.out.println(  p1.getRating()  );
System.out.println(  p1.getPrice()  );
System.out.println(  p1.getProductID()  );

//30$ sale is on going, change the value of price
p1.setPrice(113.39 - 30);

//Given all product info in one String as below
String productInfo = "Bag, 4.9, 3.99.99, gucci12";
//take above String and turn it into Product Objecet

String[] productSplitted = productInfo.split(", ");
//-- {}"Bag, 4.9, 3.99, gucci12"}
//---   0     1     2       3

String productName = productSplitted[0];
float productRating = Float.parseFloat(productSplitted[1]);
double productPrice = Double.parseDouble(productSplitted[2]);
String productId = productSplitted[3];

Product p2 = new Product();
p2.initializeAllFieldValue(productName, productRating, productPrice, productId);






}
}
