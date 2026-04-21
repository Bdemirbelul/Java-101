import java.util.Scanner;

public class RecursiveDesenOlusturma {

    static void desen(int mevcut, int orijinal, boolean azaliyor) {
        System.out.print(mevcut + " ");

        if (mevcut == orijinal && !azaliyor) {
            return;
        }

        if (azaliyor) {
            if (mevcut <= 0) {
                desen(mevcut + 5, orijinal, false);
            } else {
                desen(mevcut - 5, orijinal, true);
            }
        } else {
            desen(mevcut + 5, orijinal, false);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayisi : ");
        int n = input.nextInt();

        System.out.print("Ciktisi : ");
        desen(n, n, true);

        input.close();
    }
}
