import java.util.Scanner;

public class MukemmelSayiKontrolu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();

        if (sayi <= 1) {
            System.out.println(sayi + " Mukemmel sayi degildir.");
            input.close();
            return;
        }

        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayi) {
            System.out.println(sayi + " Mukemmel sayidir");
        } else {
            System.out.println(sayi + " Mukemmel sayi degildir.");
        }

        input.close();
    }
}
