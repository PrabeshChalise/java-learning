package TwoDArray;

import java.util.Scanner;

public class UserInputAndSearchingForNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of column");
        int column = sc.nextInt();
        int numbers[][]= new int[rows][column];
        System.out.println("Enter numbers: ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<column; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number to search");
        int search = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<column; j++){
                if (search==numbers[i][j]) {
                    System.out.println("The index of a number is: "+ i + "," +  j);
                }
            }
        }

    }
    
}
