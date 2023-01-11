import java.util.Scanner;

public class FibonacciSequence {
    /*

    The program shows us Fibonacci Sequence having the entered number of elements. I know for loop is more proper loop this kind of works
    since we know the number of loops. I used the do-while loop instead of using for loop, no reason to use this one but it works.
     */

    public static void main(String[] args) {
        int n, i=1, j=1, count=0,temp=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number of elements in Fibonacci Sequence: ");
        n= input.nextInt();
        System.out.print("The result: ");
        do {
            System.out.print(temp + " ");
            temp += i;
            i= temp- i;
            count++;
        }while(count!=n);
    }
}
