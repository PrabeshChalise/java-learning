import java.util.Scanner;

public class AllEvenNumbersTillNNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        for(int i=2; i<=a; i=i+2){
            System.out.println(i);
        }
    }
}
