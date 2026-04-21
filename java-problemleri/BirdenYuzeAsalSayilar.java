public class BirdenYuzeAsalSayilar {
    public static void main(String[] args) {
        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asalMi = true;

            for (int bolen = 2; bolen < sayi; bolen++) {
                if (sayi % bolen == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.print(sayi + " ");
            }
        }
    }
}
