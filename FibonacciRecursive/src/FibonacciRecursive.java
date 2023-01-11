import java.util.Scanner;
public class FibonacciRecursive {
    /*
    by using this program you can find the nth element of the Fibonacci Sequence.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number:  ");
        int find = in.nextInt();

        System.out.println(fibonacciSequence(find));
    }
    static int fibonacciSequence(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
    }
}
