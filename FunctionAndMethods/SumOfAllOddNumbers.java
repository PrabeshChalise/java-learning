package FunctionAndMethods;

import java.util.Scanner;

public class SumOfAllOddNumbers {
    public static int Sum(int n){
        int sum = 0;
        for(int i=1; i<=n; i= i+2){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Sum of all odd number from 1 to n is: "+ Sum(n));
    }
    
}
