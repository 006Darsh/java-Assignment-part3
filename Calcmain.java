import mypackage.Calc1;
import mypackage.Calc2;
import mypackage.Calc3;
import mypackage.Calc4;

public class Calcmain {
    public static void main(String[] args) {
        Calc1 c1 = new Calc1();
        Calc2 c2 = new Calc2();
        Calc3 c3 = new Calc3();
        Calc4 c4 = new Calc4();
        System.out.println("Addition  :"+c1.sum(10,20));
        System.out.println("Subtraction  :"+c3.subtraction(10,20));
        System.out.println("Multiplicaton  :"+c2.product(10,20));
        System.out.println("Division  :"+c4.division(10,20));
        System.out.println("This code is prepared by 21CE006 Aswani Darsh");
    }
}
