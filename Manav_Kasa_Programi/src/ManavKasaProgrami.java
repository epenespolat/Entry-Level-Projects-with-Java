import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {
        double toplamtutar,armut = 2.14,elma=3.67,domates=1.11, muz=0.95,patlican=5, armutkg,elmakg, domateskg,muzkg,patlicankg;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kilogram Armut aldığınızı yazınız:");
        armutkg = input.nextDouble();
        System.out.println("Kaç kilogram Elma aldığınızı yazınız:");
        elmakg = input.nextDouble();
        System.out.println("Kaç kilogram Domates aldığınızı yazınız:");
        domateskg = input.nextDouble();
        System.out.println("Kaç kilogram Muz aldığınızı yazınız:");
        muzkg = input.nextDouble();
        System.out.println("Kaç kilogram Patlıcan aldığınızı yazınız:");
        patlicankg = input.nextDouble();

        toplamtutar = (armut*armutkg) + (elma*elmakg) + (domates*domateskg) + (muz*muzkg) + (patlican*patlicankg);

        System.out.println("Toplam Tutar = " + toplamtutar + "TL");






    }
}
