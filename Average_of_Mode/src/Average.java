import java.util.Scanner;

public class Average {
/*
Calculating the Averages of numbers which can be divided into both 3 and 4 until the entered number!
 */
    public static void main(String[] args) {
        int n, sum=0, count=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the Number: ");
        n= input.nextInt();

        for(int i=0; i<= n; i++){
            System.out.println("* "+i);
            if (i % 3 == 0 && i % 4 == 0){
                sum += i;
                count++;
            }
        }
        double avg = sum /count;
        if (avg != 0) {
            System.out.println("The Average: " + avg);
        }else{
            System.out.println("No value exists which can be divided into both 3 and 4 until "+ "'" + n + "'");
        }
    }
}
