package FunctionAndMethods;

public class InfiniteLoop {
    public static void main(String[] args) {
       int i = 1;
        do {
            i++;
            System.out.println("Infinite loop count down: "+ i);
        } while (true);
    }
}
