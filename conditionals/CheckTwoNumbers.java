import java.util.Scanner;

public class CheckTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = sc.nextInt();
        System.out.println("Please enter second number");
        int b = sc.nextInt();
        if (a<b) {
            System.out.println("a is lesser");
        }
        else if (a>b) {
            System.out.println("a is greater");
        } else {
            System.out.println("a is equal");
        }
    }
}
