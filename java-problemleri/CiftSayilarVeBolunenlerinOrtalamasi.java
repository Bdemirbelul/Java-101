import java.util.Scanner;

public class CiftSayilarVeBolunenlerinOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();

        System.out.println("0'dan " + sayi + " sayisina kadar cift sayilar:");
        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int toplam = 0;
        int adet = 0;

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet == 0) {
            System.out.println("3 ve 4'e tam bolunen sayi bulunamadi.");
        } else {
            double ortalama = (double) toplam / adet;
            System.out.println("3 ve 4'e tam bolunen sayilarin ortalamasi: " + ortalama);
        }

        input.close();
    }
}
