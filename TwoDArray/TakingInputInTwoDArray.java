package TwoDArray;

import java.util.Scanner;

public class TakingInputInTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter Column: ");
        int column = sc.nextInt();
        int [][] numbers = new int[rows][column];
        System.out.println("Enter numbers: ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<column; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output: ");
           for(int i = 0; i<rows; i++){
            for(int j = 0; j<column; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
