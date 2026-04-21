import java.util.Scanner;

public class YildizlarlaTersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayisi : ");
        int basamak = input.nextInt();

        if (basamak <= 0) {
            System.out.println("Lutfen pozitif bir deger giriniz.");
            input.close();
            return;
        }

        int yildizSayisi = 2 * basamak - 1;
        for (int i = yildizSayisi; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
