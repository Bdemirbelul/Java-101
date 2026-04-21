import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayisini giriniz: ");
        int elemanSayisi = input.nextInt();

        if (elemanSayisi <= 0) {
            System.out.println("Lutfen pozitif bir eleman sayisi giriniz.");
            input.close();
            return;
        }

        int a = 0;
        int b = 1;

        System.out.print(elemanSayisi + " elemanli Fibonacci serisi : ");
        for (int i = 1; i <= elemanSayisi; i++) {
            System.out.print(a + " ");
            int sonraki = a + b;
            a = b;
            b = sonraki;
        }

        input.close();
    }
}
