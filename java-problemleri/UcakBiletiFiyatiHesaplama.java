import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km turunden giriniz: ");
        double mesafe = input.nextDouble();

        System.out.print("Yasinizi giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus ): ");
        int yolculukTipi = input.nextInt();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatali Veri Girdiniz !");
        } else {
            double normalTutar = mesafe * 0.10;
            double indirimliTutar = normalTutar;

            if (yas < 12) {
                indirimliTutar *= 0.50;
            } else if (yas <= 24) {
                indirimliTutar *= 0.90;
            } else if (yas > 65) {
                indirimliTutar *= 0.70;
            }

            if (yolculukTipi == 2) {
                indirimliTutar *= 0.80;
                indirimliTutar *= 2;
            }

            System.out.println("Toplam Tutar = " + indirimliTutar + " TL");
        }

        input.close();
    }
}
