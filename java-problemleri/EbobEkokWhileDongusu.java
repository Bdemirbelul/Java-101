import java.util.Scanner;

public class EbobEkokWhileDongusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayiyi giriniz: ");
        int n1 = input.nextInt();

        System.out.print("2. sayiyi giriniz: ");
        int n2 = input.nextInt();

        int a = Math.abs(n1);
        int b = Math.abs(n2);

        if (a == 0 && b == 0) {
            System.out.println("EBOB ve EKOK 0,0 icin tanimsizdir.");
            input.close();
            return;
        }

        int ebob = 1;
        int i = 1;
        int min = (a < b) ? a : b;

        while (i <= min) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
            i++;
        }

        int ekok = (a * b) / ebob;

        System.out.println("EBOB(" + n1 + ", " + n2 + ") = " + ebob);
        System.out.println("EKOK(" + n1 + ", " + n2 + ") = " + ekok);

        input.close();
    }
}
