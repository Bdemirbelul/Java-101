public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] dizi = {3, 8, 2, 8, 10, 12, 2, 7, 6, 10, 15, 4, 4, 9};
        int[] tekrarEdenler = new int[dizi.length];
        int tekrarIndex = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 != 0) {
                continue;
            }

            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j] && !varMi(tekrarEdenler, dizi[i])) {
                    tekrarEdenler[tekrarIndex++] = dizi[i];
                    break;
                }
            }
        }

        System.out.println("Tekrar eden cift sayilar:");
        for (int i = 0; i < tekrarIndex; i++) {
            System.out.print(tekrarEdenler[i] + " ");
        }
    }

    static boolean varMi(int[] arr, int value) {
        for (int j : arr) {
            if (j == value) {
                return true;
            }
        }
        return false;
    }
}
