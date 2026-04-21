import java.util.Scanner;

public class FaktoriyelVeKombinasyon {
    public static long faktoriyelHesapla(int n) {
        long sonuc = 1;
        for (int i = 1; i <= n; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Faktoriyeli alinacak sayiyi girin: ");
        int sayi = input.nextInt();

        if (sayi < 0) {
            System.out.println("Negatif sayilarin faktoriyeli hesaplanamaz.");
        } else {
            long faktoriyel = faktoriyelHesapla(sayi);
            System.out.println(sayi + "! = " + faktoriyel);
        }

        System.out.print("Kombinasyon icin n degerini girin: ");
        int n = input.nextInt();

        System.out.print("Kombinasyon icin r degerini girin: ");
        int r = input.nextInt();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Gecersiz degerler girdiniz.");
        } else {
            long kombinasyon = faktoriyelHesapla(n) / (faktoriyelHesapla(r) * faktoriyelHesapla(n - r));
            System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
        }

        input.close();
    }
}
