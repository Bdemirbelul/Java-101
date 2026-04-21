import java.util.Scanner;

public class KdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("KDV'siz tutari girin: ");
        double kdvsizFiyat = input.nextDouble();

        double kdvOrani = (kdvsizFiyat >= 0 && kdvsizFiyat <= 1000) ? 0.18 : 0.08;
        double kdvTutari = kdvsizFiyat * kdvOrani;
        double kdvliFiyat = kdvsizFiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat = " + kdvsizFiyat);
        System.out.println("KDV Orani = " + (kdvOrani * 100) + "%");
        System.out.println("KDV Tutari = " + kdvTutari);
        System.out.println("KDV'li Fiyat = " + kdvliFiyat);

        input.close();
    }
}
