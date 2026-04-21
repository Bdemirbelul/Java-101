import java.util.Scanner;

public class UcSayiyiKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayiyi girin: ");
        int a = input.nextInt();

        System.out.print("2. sayiyi girin: ");
        int b = input.nextInt();

        System.out.print("3. sayiyi girin: ");
        int c = input.nextInt();

        int kucuk, orta, buyuk;

        if (a <= b && a <= c) {
            kucuk = a;
            if (b <= c) {
                orta = b;
                buyuk = c;
            } else {
                orta = c;
                buyuk = b;
            }
        } else if (b <= a && b <= c) {
            kucuk = b;
            if (a <= c) {
                orta = a;
                buyuk = c;
            } else {
                orta = c;
                buyuk = a;
            }
        } else {
            kucuk = c;
            if (a <= b) {
                orta = a;
                buyuk = b;
            } else {
                orta = b;
                buyuk = a;
            }
        }

        System.out.println("Kucukten buyuge: " + kucuk + " < " + orta + " < " + buyuk);

        input.close();
    }
}
