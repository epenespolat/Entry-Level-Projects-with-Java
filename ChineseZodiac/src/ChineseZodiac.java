import java.util.Scanner;

public class ChineseZodiac {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int birthYear=0, mode=0;
        String zodiacSign="";

        System.out.println("Please Enter Birth Year: ");
        birthYear=input.nextInt();

        mode= birthYear%12;                 // determine the mode of the birth year wrt. "12"

        switch (mode){                      //  using the found mode to determine the correct Zodiac sign
            case 0:
                zodiacSign="Monkey";
                System.out.println("Chinese Zodiac Sign: "+ zodiacSign);
            break;
            case 1:
                zodiacSign="Roaster";
                System.out.println("Chinese Zodiac Sign: "+ zodiacSign);
                break;
            case 2:
                zodiacSign="Dog";
                System.out.println("Chinese Zodiac Sign: "+ zodiacSign);
                break;
            case 3:
                zodiacSign="Pig";
                System.out.println("Chinese Zodiac Sign: "+ zodiacSign);
                break;
            case 4:
                zodiacSign="Rat";
                System.out.println("Chinese Zodiac Sign: "+ zodiacSign);
                break;
            case 5:
                zodiacSign="Ox";
                System.out.println("Chinese Zodiac Sign: "+ zodiacSign);
                break;
            case 6:
                zodiacSign="Tiger";
                System.out.println("Chinese Zodiac Sign: "+ zodiacSign);
                break;
            case 7:
                zodiacSign="Rabbit";
                System.out.println("Chinese Zodiac Sign: "+ zodiacSign);
                break;
            case 8:
                zodiacSign="Dragon";
                System.out.println("Chinese Zodiac Sign: "+ zodiacSign);
                break;
            case 9:
                zodiacSign="Snake";
                System.out.println("Chinese Zodiac Sign: "+ zodiacSign);
                break;
            case 10:
                zodiacSign="Horse";
                System.out.println("Chinese Zodiac Sign: "+ zodiacSign);
                break;
            case 11:
                zodiacSign="Goat";
                System.out.println("Chinese Zodiac Sign: "+ zodiacSign);
                break;

            default:
                System.out.println("Please enter value greater than '0' !");



        }
    }
}
