import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        int edge1,edge2,edge3;
        double u,area,perimeter;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first edge of the Triangle: ");
        edge1 = input.nextInt();
        System.out.println("Please enter second edge of the Triangle: ");
        edge2 = input.nextInt();
        System.out.println("Please enter third edge of the Triangle: ");
        edge3 = input.nextInt();

        /*
        Heron's Formula:
        Perimeter of Triangle = 2𝑢
        𝑢 = (a+b+c) / 2
        Area = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */
        u = (edge1 + edge2+ edge3)/2;
        perimeter = 2 * u;

        area = Math.sqrt(u * (u-edge1) * (u-edge2) * (u-edge3));

        System.out.println("The /'area/' of triangle: " + area);


    }

}
