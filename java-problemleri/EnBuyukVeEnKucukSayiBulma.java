import java.util.Scanner;

public class EnBuyukVeEnKucukSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kac tane sayi gireceksiniz: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Lutfen pozitif bir adet giriniz.");
            input.close();
            return;
        }

        System.out.print("1. Sayiyi giriniz: ");
        int sayi = input.nextInt();

        int enBuyuk = sayi;
        int enKucuk = sayi;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayiyi giriniz: ");
            sayi = input.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En buyuk sayi: " + enBuyuk);
        System.out.println("En kucuk sayi: " + enKucuk);

        input.close();
    }
}
