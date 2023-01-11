import java.util.Scanner;

public class HarmonicalSeries {

    public static void main(String[] args) {

        int number;
        double total=0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Positive-Real Number:");
        number = scan.nextInt();

        for (double i = 1; i <= number; i++) {

            total += 1 / i;
        }
        System.out.println(total);
    }
}
