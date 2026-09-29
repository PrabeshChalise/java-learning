package FunctionAndMethods;

import java.util.Scanner;

public class RadiusToCircumference {
    public static float Circumference(float r){
        float c = 2*(22.0f/7.0f)*r;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        float r = sc.nextInt();
        System.out.println(Circumference(r));
    }
    
}
