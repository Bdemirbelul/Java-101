import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu girin: ");
        double matematik = input.nextDouble();

        System.out.print("Fizik notunu girin: ");
        double fizik = input.nextDouble();

        System.out.print("Kimya notunu girin: ");
        double kimya = input.nextDouble();

        System.out.print("Turkce notunu girin: ");
        double turkce = input.nextDouble();

        System.out.print("Tarih notunu girin: ");
        double tarih = input.nextDouble();

        System.out.print("Muzik notunu girin: ");
        double muzik = input.nextDouble();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        String durum = ortalama > 60 ? "Sinifi Gecti" : "Sinifta Kaldi";

        System.out.println("Ortalamaniz: " + ortalama);
        System.out.println(durum);

        input.close();
    }
}
