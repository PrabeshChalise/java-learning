import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter a number");
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            sum = sum +i;
        }
        System.out.println(sum);
    }
}
