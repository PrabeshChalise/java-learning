package StringsInJava;

public class OtherFunctionsInStrings {
    public static void main(String[] args) {
        //charAT
        // String name = "Prabesh";
        // int length = name.length();
        // for(int i = 0; i <length; i++){
        //     System.out.println(name.charAt(i));
        // }


        //Comparing 2 strings
        String name1 = "abc";
        String name2= "xyz";
        if(name1.compareTo(name2)>0){
            System.out.println("name1 is greater than name2");
        }
        else if(name1.compareTo(name2)==0){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("name2 is greater than name1");
        }

    }
}
