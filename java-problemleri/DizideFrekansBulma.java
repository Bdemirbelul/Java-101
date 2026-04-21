public class DizideFrekansBulma {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] kontrolEdildi = new boolean[dizi.length];

        System.out.println("Dizi : [10, 20, 20, 10, 10, 20, 5, 20]");
        System.out.println("Tekrar Sayilari");

        for (int i = 0; i < dizi.length; i++) {
            if (kontrolEdildi[i]) {
                continue;
            }

            int sayac = 1;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    sayac++;
                    kontrolEdildi[j] = true;
                }
            }

            System.out.println(dizi[i] + " sayisi " + sayac + " kere tekrar edildi.");
        }
    }
}
