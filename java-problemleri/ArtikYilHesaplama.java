import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yil Giriniz : ");
        int yil = input.nextInt();

        boolean artikYil;

        if (yil % 400 == 0) {
            artikYil = true;
        } else if (yil % 100 == 0) {
            artikYil = false;
        } else {
            artikYil = yil % 4 == 0;
        }

        if (artikYil) {
            System.out.println(yil + " bir artik yildir !");
        } else {
            System.out.println(yil + " bir artik yil degildir !");
        }

        input.close();
    }
}
