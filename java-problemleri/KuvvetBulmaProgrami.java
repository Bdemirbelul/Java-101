import java.util.Scanner;

public class KuvvetBulmaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sinir sayisi giriniz: ");
        int sayi = input.nextInt();

        System.out.println("2'nin kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("4'un kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("5'in kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.print(i + " ");
        }
        System.out.println();

        input.close();
    }
}
