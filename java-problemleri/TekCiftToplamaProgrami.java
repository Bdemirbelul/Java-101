import java.util.Scanner;

public class TekCiftToplamaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tekToplam = 0;
        System.out.println("Negatif bir deger girilene kadar sayi giriniz (tek sayilar toplanacak):");
        while (true) {
            int sayi = input.nextInt();
            if (sayi < 0) {
                break;
            }
            if (sayi % 2 != 0) {
                tekToplam += sayi;
            }
        }
        System.out.println("Girilen tek sayilarin toplami: " + tekToplam);

        int ciftVeDortunKatiToplam = 0;
        System.out.println("Tek bir sayi girilene kadar sayi giriniz (cift ve 4'un katlari toplanacak):");
        while (true) {
            int sayi = input.nextInt();
            if (sayi % 2 != 0) {
                break;
            }
            if (sayi % 4 == 0) {
                ciftVeDortunKatiToplam += sayi;
            }
        }
        System.out.println("Cift ve 4'un katlari olan sayilarin toplami: " + ciftVeDortunKatiToplam);

        input.close();
    }
}
