import java.util.Scanner;

public class DiziElemanlariniSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Lutfen pozitif bir boyut giriniz.");
            input.close();
            return;
        }

        int[] dizi = new int[n];

        System.out.println("Dizinin elemanlarini giriniz :");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemani : ");
            dizi[i] = input.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dizi[i] > dizi[j]) {
                    int gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }

        System.out.print("Siralama : ");
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i] + " ");
        }

        input.close();
    }
}
