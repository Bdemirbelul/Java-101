import java.util.Scanner;

public class RecursiveUsluSayiHesaplama {

    static long usAl(int taban, int us) {
        if (us == 0) {
            return 1;
        }
        return taban * usAl(taban, us - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban degeri giriniz: ");
        int taban = input.nextInt();

        System.out.print("Us degeri giriniz: ");
        int us = input.nextInt();

        if (us < 0) {
            System.out.println("Bu program negatif us degerini desteklemiyor.");
        } else {
            long sonuc = usAl(taban, us);
            System.out.println(taban + "^" + us + " = " + sonuc);
        }

        input.close();
    }
}
