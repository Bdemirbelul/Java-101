import java.util.Scanner;

public class GecmeNotuHesaplamaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        double matematik = input.nextDouble();

        System.out.print("Fizik notu: ");
        double fizik = input.nextDouble();

        System.out.print("Turkce notu: ");
        double turkce = input.nextDouble();

        System.out.print("Kimya notu: ");
        double kimya = input.nextDouble();

        System.out.print("Muzik notu: ");
        double muzik = input.nextDouble();

        double toplam = 0;
        int dersSayisi = 0;

        if (matematik >= 0 && matematik <= 100) {
            toplam += matematik;
            dersSayisi++;
        }
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            dersSayisi++;
        }
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            dersSayisi++;
        }
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            dersSayisi++;
        }
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            dersSayisi++;
        }

        if (dersSayisi == 0) {
            System.out.println("Gecerli not girilmedi.");
        } else {
            double ortalama = toplam / dersSayisi;
            String durum = ortalama >= 55 ? "Sinifi Gecti" : "Sinifta Kaldi";

            System.out.println("Ortalama: " + ortalama);
            System.out.println(durum);
        }

        input.close();
    }
}
