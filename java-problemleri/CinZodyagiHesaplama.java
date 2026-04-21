import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dogum Yilinizi Giriniz : ");
        int dogumYili = input.nextInt();

        int kalan = dogumYili % 12;
        String burc;

        if (kalan == 0) {
            burc = "Maymun";
        } else if (kalan == 1) {
            burc = "Horoz";
        } else if (kalan == 2) {
            burc = "Kopek";
        } else if (kalan == 3) {
            burc = "Domuz";
        } else if (kalan == 4) {
            burc = "Fare";
        } else if (kalan == 5) {
            burc = "Okuz";
        } else if (kalan == 6) {
            burc = "Kaplan";
        } else if (kalan == 7) {
            burc = "Tavsan";
        } else if (kalan == 8) {
            burc = "Ejderha";
        } else if (kalan == 9) {
            burc = "Yilan";
        } else if (kalan == 10) {
            burc = "At";
        } else {
            burc = "Koyun";
        }

        System.out.println("Cin Zodyagi Burcunuz : " + burc);

        input.close();
    }
}
