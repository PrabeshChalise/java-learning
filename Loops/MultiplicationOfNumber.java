import java.util.Scanner;

public class MultiplicationOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = sc.nextInt();
        for(int i=1; i<=10; i++){
            int mult = a * i;
            System.out.println(mult);
        }

    }
}
