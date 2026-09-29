package FunctionAndMethods;

import java.util.Scanner;

public class TakeUserInputAndCheckForPositiveOrNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much number you want to enter: ");
        int n = sc.nextInt();
        System.out.println("Enter numbers now: ");
        for(int i = 1; i<=n; i++){
            int a = sc.nextInt();
            if(a>0){
                System.out.println("positive number");
                System.out.println(a);
            }
            else if(a==0){
                System.out.println("Zero number");
                System.out.println(a);
            }
            else{
                System.out.println("negative number");
                System.out.println(a);
            }
        }
    }
}
