import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        System.out.print("Armut kac kilo ?: ");
        double armutKg = input.nextDouble();

        System.out.print("Elma kac kilo ?: ");
        double elmaKg = input.nextDouble();

        System.out.print("Domates kac kilo ?: ");
        double domatesKg = input.nextDouble();

        System.out.print("Muz kac kilo ?: ");
        double muzKg = input.nextDouble();

        System.out.print("Patlican kac kilo ?: ");
        double patlicanKg = input.nextDouble();

        double toplamTutar = (armutKg * armutFiyat)
                + (elmaKg * elmaFiyat)
                + (domatesKg * domatesFiyat)
                + (muzKg * muzFiyat)
                + (patlicanKg * patlicanFiyat);

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");

        input.close();
    }
}
