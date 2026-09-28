package AdvancedPatterns;

public class NumberPyramid {
    public static void main(String[] args) {
        int n= 9;
        for(int i=1; i<=n;i++){
            if(n%2!=0){
                for(int j=n-i; j>=1; j--){
                    System.out.print(" ");
                }
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
             if(n%2!=0){
                for(int j=(n+i)/2; j>=1; j--){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
