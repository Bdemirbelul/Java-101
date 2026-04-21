import java.util.Scanner;

public class RecursiveAsalSayiKontrolu {

    static boolean asalMi(int sayi, int bolen) {
        if (sayi < 2) {
            return false;
        }
        if (bolen * bolen > sayi) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return asalMi(sayi, bolen + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz : ");
        int sayi = input.nextInt();

        if (asalMi(sayi, 2)) {
            System.out.println(sayi + " sayisi ASALDIR !");
        } else {
            System.out.println(sayi + " sayisi ASAL degildir !");
        }

        input.close();
    }
}
