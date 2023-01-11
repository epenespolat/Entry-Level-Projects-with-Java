import java.util.Scanner;

public class EventAdvisor {
/*
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */
    public static void main(String[] args) {
        int heat;
        Scanner input=new Scanner(System.in);

        System.out.println("Please Enter Heat: ");
        heat = input.nextInt();

        if (heat <= 25){
            if (heat < 5){

                System.out.println("'Skiing' is a proper event for you!");
            } else if (heat>=5 && heat< 25) {
                if (heat<15){
                    System.out.println("'Cinema' is a proper event for you!");
                    if (heat>=10){
                        System.out.println("'Picnic' is one of the proper event for you, as well!");
                    }
                } else if (heat>=15 && heat< 25) {

                    System.out.println("'Picnic' is a proper event for you!");
                    }
                 }else {
                System.out.println("'Swimming' is a proper event for you!");
            }
        }
    }
}
