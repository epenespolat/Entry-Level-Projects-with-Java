import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int n1,n2,select;
        double result=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter First Number:");
        n1 = input.nextInt();
        System.out.println("Please Enter Second Number:");
        n2 = input.nextInt();

        System.out.println("Please select one of the operations listed below: ");
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.println("Select: ");

        select = input.nextInt();

        switch (select){
            case 1:
                result = n1+n2;
                break;
            case 2:
                result= n1-n2;
                break;
            case 3:
                result= n1*n2;
                break;
            case 4:
                result = (double) n1 / n2;
                break;
        }

        System.out.println("Result= " + result);
    }

}
