package FunctionAndMethods;

import java.util.Scanner;

public class MultiplicationOfTwoNumbers {
    public static int Multiply(int a, int b){
        int multiplication = a*b;
        return multiplication;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Multiplication of two numbers is: "+ Multiply(a, b) );
    }
    
}
