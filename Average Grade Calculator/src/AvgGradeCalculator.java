import java.util.Scanner;

public class AvgGradeCalculator {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        // Get the values

        System.out.println("Matematik notunu giriniz: ");
        int matGrade = input.nextInt();

        System.out.println("Fizik notunu giriniz: ");
        int fizGrade = input.nextInt();

        System.out.println("Kimya notunu giriniz: ");
        int kimGrade = input.nextInt();

        System.out.println("Türkçe notunu giriniz: ");
        int turkGrade = input.nextInt();

        System.out.println("Tarih notunu giriniz: ");
        int tarGrade = input.nextInt();

        System.out.println("Müzik notunu giriniz: ");
        int muzGrade = input.nextInt();

        double avgTotal = (matGrade +fizGrade+kimGrade+turkGrade+tarGrade+muzGrade)/ 6;

        String result = avgTotal>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";


        System.out.println("Not Ortalamanız: " +avgTotal  +"\nSınıfı Geçme Durumunuz: " + result);

    }

}
