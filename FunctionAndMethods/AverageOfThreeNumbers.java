package FunctionAndMethods;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static float Average(int a, int b, int c){
        int average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number");
        int c = sc.nextInt();
        System.out.println("Average of 3 numbers is: "+ Average(a, b, c));
    }
    
}
