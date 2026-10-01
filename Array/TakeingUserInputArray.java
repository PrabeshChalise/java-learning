package Array;

import java.util.Scanner;

public class TakeingUserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int numbers[]= new int[size];
        System.out.println("Enter numbers");
        for(int i = 0; i<size; i++){
            numbers[i]= sc.nextInt();
        }
        System.out.println("Numbers are: ");
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }
}
