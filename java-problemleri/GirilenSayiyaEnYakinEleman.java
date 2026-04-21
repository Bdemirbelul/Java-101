import java.util.Scanner;

public class GirilenSayiyaEnYakinEleman {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);

        System.out.print("Girilen Sayi : ");
        int sayi = input.nextInt();

        Integer enYakinKucuk = null;
        Integer enYakinBuyuk = null;

        for (int eleman : dizi) {
            if (eleman < sayi) {
                if (enYakinKucuk == null || eleman > enYakinKucuk) {
                    enYakinKucuk = eleman;
                }
            }

            if (eleman > sayi) {
                if (enYakinBuyuk == null || eleman < enYakinBuyuk) {
                    enYakinBuyuk = eleman;
                }
            }
        }

        if (enYakinKucuk != null) {
            System.out.println("Girilen sayidan kucuk en yakin sayi : " + enYakinKucuk);
        } else {
            System.out.println("Girilen sayidan kucuk bir deger yok.");
        }

        if (enYakinBuyuk != null) {
            System.out.println("Girilen sayidan buyuk en yakin sayi : " + enYakinBuyuk);
        } else {
            System.out.println("Girilen sayidan buyuk bir deger yok.");
        }

        input.close();
    }
}
