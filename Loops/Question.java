import java.util.Scanner;

public class Question {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        System.out.println("Please enter number 0 or 1");
        int a = sc.nextInt();
        if (a==1) {
         do{
                System.out.println("Enter mark");
                int mark = sc.nextInt();     
                if (mark>=90) {
                    System.out.println("this is good");
                    System.out.println("Please enter number 0 or 1");
                    a = sc.nextInt();
                }           
                else if (mark>=60) {
                    System.out.println("this i also good");
                    System.out.println("Please enter number 0 or 1");
                    a = sc.nextInt();
                } else {
                    System.out.println("this is good as well");
                    System.out.println("Please enter number 0 or 1");
                    a = sc.nextInt();
                }

            }
            while(a==1);   
        }
       
    }
}
