package FunctionAndMethods;

import java.util.Scanner;

public class MakingCalculator {
    public static int Sum(int a, int b){
        int add = a+b;
        return add;
    }
    public static int Subtract(int a, int b){
        int subtract = a-b;
        return subtract;
    }
    public static int Division(int a, int b){
        int division = a/b;
        return division;
    }
    public static int Multiplication(int a, int b){
        int mult = a*b;
        return mult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter 1 for sum, 2 for subtraction, 3 for division, 4 for multiplication");
        int c = sc.nextInt();
        if (c==1) {
            System.out.println("Result is: "+ Sum(a, b));
        }
        else if(c==2){
            System.out.println("Result is: "+ Subtract(a, b));
        }
        else if(c==3){
            System.out.println("Result is: "+ Division(a, b));
        }
        else if(c==4){
            System.out.println("Result is: "+ Multiplication(a, b));
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
