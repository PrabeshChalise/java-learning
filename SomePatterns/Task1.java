package SomePatterns;

public class Task1 {
    public static void main(String[] args) {
        int b= 5;
        for(int i=1; i<=b; i++){
            for(int j=1; j<=b-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=b; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
