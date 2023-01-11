import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {

        int radius,degreeForPart;
        double pi=3.14, area;

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Radius of Circle: ");
        radius = input.nextInt();
        System.out.println("Please Enter Degree of Circle's part(Should be between 0-360): ");
        degreeForPart = input.nextInt();

        area =  (pi* radius*radius * degreeForPart)/360;

        System.out.println("The area of the circle is: "+ area);



    }
}
