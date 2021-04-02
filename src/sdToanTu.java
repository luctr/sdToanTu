import com.sun.java.accessibility.util.java.awt.CheckboxTranslator;

import java.util.Scanner;

public class sdToanTu {
    public static void main(String[] args) {

        float weight;
        float height;

        Scanner scanner=new Scanner(System.in);
        System.out.println("weight :");
        weight =scanner.nextFloat();

        System.out.println("height :");
        height=scanner.nextFloat();

        float area = weight * height;
        System.out.println("Area :" + area);
    }
}
