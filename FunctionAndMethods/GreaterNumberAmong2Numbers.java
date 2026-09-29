package FunctionAndMethods;

import java.util.Scanner;

public class GreaterNumberAmong2Numbers {
    public static int Greater(int a, int b){
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Greater number is: "+ Greater(a, b));
    }
    
}
