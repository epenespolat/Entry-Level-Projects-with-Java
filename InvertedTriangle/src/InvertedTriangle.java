import java.util.Scanner;

public class InvertedTriangle {
    /*
    the digit : 10
     *******************
      *****************
       ***************
        *************
         ***********
          *********
           *******
            *****
             ***
              *
      */
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the digit for Inverted Triangle: ");
        n = input.nextInt();

        for(int i=1; i<=n ;i++){

            for (int j=0; j <= i+1 ;j++) {
                System.out.print(" ");
            }
            for(int k =0; k<= 2*n-2*i; k++){
                    System.out.print("*");
            }

            System.out.println();
        }



    }


}
