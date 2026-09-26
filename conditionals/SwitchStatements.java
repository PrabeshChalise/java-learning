import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1-3");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Hello");
                break;
        
            case 2:
                System.out.println("Namaste");
                break;
            
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("invalid number");
        }
    }

}
