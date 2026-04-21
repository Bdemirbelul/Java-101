import java.util.Scanner;

public class UsluSayiHesaplamaForDongusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban degerini giriniz: ");
        int taban = input.nextInt();

        System.out.print("Us degerini giriniz: ");
        int us = input.nextInt();

        long sonuc = 1;

        if (us < 0) {
            System.out.println("Bu program negatif us degerleri icin desteklenmiyor.");
        } else {
            for (int i = 1; i <= us; i++) {
                sonuc *= taban;
            }
            System.out.println(taban + "^" + us + " = " + sonuc);
        }

        input.close();
    }
}
