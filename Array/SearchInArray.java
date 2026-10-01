package Array;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i=0; i<size; i++){
            numbers[i]= sc.nextInt();
        }
        System.out.println("Enter number you want to search: ");
        int search = sc.nextInt();
        for(int i =0; i<size; i++){
            if (search==numbers[i]) {
                System.out.println("Index of number you searched is: "+ i);
            }
        }

    }
    
}
