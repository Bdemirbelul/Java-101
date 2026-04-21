import java.util.Scanner;

public class PalindromSayiKontrolu {
    public static boolean palindromMu(int sayi) {
        int orijinal = sayi;
        int ters = 0;

        while (sayi != 0) {
            int basamak = sayi % 10;
            ters = (ters * 10) + basamak;
            sayi /= 10;
        }

        return orijinal == ters;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();

        if (palindromMu(sayi)) {
            System.out.println(sayi + " bir palindrom sayidir.");
        } else {
            System.out.println(sayi + " bir palindrom sayi degildir.");
        }

        input.close();
    }
}
