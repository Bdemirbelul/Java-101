import java.util.Scanner;

public class HarmonikSeriHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Lutfen pozitif bir tam sayi giriniz.");
        } else {
            double harmonikToplam = 0.0;

            for (int i = 1; i <= n; i++) {
                harmonikToplam += 1.0 / i;
            }

            System.out.println("Harmonik seri toplami: " + harmonikToplam);
        }

        input.close();
    }
}
