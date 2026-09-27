package SomePatterns;

import java.util.Scanner;

public class PrintOppositeTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=b; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
