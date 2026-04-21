import java.util.Scanner;

public class ArmstrongVeBasamakToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz: ");
        int number = input.nextInt();

        int tempNumber = number;
        int basamakSayisi = 0;
        int armstrongToplam = 0;
        int basamakToplami = 0;

        int mutlakSayi = Math.abs(number);

        if (mutlakSayi == 0) {
            basamakSayisi = 1;
        } else {
            int sayac = mutlakSayi;
            while (sayac != 0) {
                sayac /= 10;
                basamakSayisi++;
            }
        }

        tempNumber = mutlakSayi;
        while (tempNumber != 0) {
            int basamakDegeri = tempNumber % 10;
            basamakToplami += basamakDegeri;

            int basamakUs = 1;
            for (int i = 1; i <= basamakSayisi; i++) {
                basamakUs *= basamakDegeri;
            }
            armstrongToplam += basamakUs;
            tempNumber /= 10;
        }

        if (mutlakSayi == 0) {
            basamakToplami = 0;
            armstrongToplam = 0;
        }

        if (armstrongToplam == mutlakSayi) {
            System.out.println(number + " sayisi bir Armstrong sayidir.");
        } else {
            System.out.println(number + " sayisi bir Armstrong sayisi degildir.");
        }

        System.out.println("Basamaklar toplami: " + basamakToplami);

        input.close();
    }
}
