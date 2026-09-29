package FunctionAndMethods;

import java.util.Scanner;

public class CheckVotingEligibility {
    public static boolean CheckEligibility(int age){
        if (age>18) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("The eligibility status is: "+ CheckEligibility(age));
    }
    
}
