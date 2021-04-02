import java.util.Scanner;

public class giaiPt {
    public static void main(String[] args) {
        Scanner pt = new Scanner(System.in);

        System.out.print("a :" );
        double a = pt.nextDouble();

        System.out.print("b :");
        double b = pt.nextDouble();

        System.out.print("c :");
        double c = pt.nextDouble();

        if (a != 0 ){
            double x = (c -a)/a;
            System.out.print("AD" + x);
        }
    }
}
