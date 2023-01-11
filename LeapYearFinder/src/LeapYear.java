import java.util.Scanner;

public class LeapYear {

    private static final Scanner input=new Scanner(System.in);

    public static void main(String[] args) {

        int year;

        System.out.println("Please Enter Year: ");
        year = input.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year!");          //in this code block eliminates whether the years can be divided 400.
            }else {
                System.out.println(year + " is not a leap year!");
            }
        } else if (year % 4 == 0 ) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
    }
}
