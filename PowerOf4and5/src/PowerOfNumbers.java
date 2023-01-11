import java.util.Scanner;

public class PowerOfNumbers {
    /*
    Showing powers of 4 and 5 until the entered number
     */
    public static void main(String[] args) {
        int n=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Number: ");
        n = input.nextInt();
        System.out.println("\nThe powers of 4: ");
        for (int i=1; i<= n; i*=4){
            System.out.println(i);
        }
        System.out.println("----------------------");

        System.out.println("The powers of 5: ");
        for (int j=1; j<= n; j*=5){

            System.out.println(j);
        }

    }
}
