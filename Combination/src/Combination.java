import java.util.Scanner;

public class Combination {
/*
    Calculating combination of two sets
    C(n,r) = n! / (r! * (n-r)!)
 */
    public static void main(String[] args) {
        int N,r, N1=1, r1=1, Nr1=1;

        Scanner input = new Scanner(System.in);
        System.out.println("We will calculate C(N,r) in this program: \n");
        System.out.println("Please enter the N value: ");
        N= input.nextInt();
        System.out.println("Please enter the r value: ");
        r= input.nextInt();

        for (int i=1; i<= N; i++){
             N1 *= i;
        }

        for (int j=1; j<= r; j++){
            r1 *= j;
        }
        for (int k=1; k<= (N-r); k++){
            Nr1 *= k;
        }

        int Com= N1/ (r1 * Nr1);
        System.out.println("\nThe answer of "+ "C("+ N + "," + r+ ")"+ ": " + Com);

    }

}
