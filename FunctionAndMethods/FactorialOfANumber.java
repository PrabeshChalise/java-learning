package FunctionAndMethods;

import java.util.Scanner;

public class FactorialOfANumber {
   
    public static int Factorial(int a){ 
        int fact = 1;
        for(int i=a; i>=1; i--){
            fact = i * fact;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Factorial is: "+ Factorial(a));
    }
    
}
