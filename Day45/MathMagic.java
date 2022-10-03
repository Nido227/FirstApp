package Day45;

public class MathMagic {
public static void main(String[] args) {

MathEquation2 math1 = new MathEquation2(120,10, '+');
MathEquation2 math2 = new MathEquation2(120,10, '-');

math1.calculate();
System.out.println(math1.getResult());

math1.calculateX(100, 200);
System.out.println(math1.getResult());

// math2.calculate();
// System.out.println(math2.getResult());





}
}
