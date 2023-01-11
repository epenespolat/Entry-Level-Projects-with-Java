import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {

        double weight, height,bmi;

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your 'Weight': ");
        weight = input.nextDouble();
        System.out.println("Please Enter Your 'Height' as meter: ");
        height = input.nextDouble();

        bmi = weight / (height*height);

        System.out.println("Your Body Mass Index is "+ bmi);

    }
}
