import java.util.Scanner;

public class Power {
// The aim of the program is that getting number and its power by user and calculating the result
    public static void main(String[] args) {

        int number, power,result=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number: ");
        number= input.nextInt();
        System.out.print("Please Enter the Power: ");
        power = input.nextInt();

        for(int i = 1; i<= power; i++){
            result *= number;
        }

        System.out.println("The result of "+number+"^"+power+" = "+result);


    }


}
