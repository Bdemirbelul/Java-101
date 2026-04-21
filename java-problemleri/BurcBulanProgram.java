import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz ayi sayi olarak girin (1-12): ");
        int ay = input.nextInt();

        System.out.print("Dogdugunuz gunu girin: ");
        int gun = input.nextInt();

        String burc = "";
        boolean gecerliTarih = true;

        if (ay == 1) {
            if (gun >= 1 && gun <= 31) burc = (gun <= 21) ? "Oglak" : "Kova";
            else gecerliTarih = false;
        } else if (ay == 2) {
            if (gun >= 1 && gun <= 29) burc = (gun <= 19) ? "Kova" : "Balik";
            else gecerliTarih = false;
        } else if (ay == 3) {
            if (gun >= 1 && gun <= 31) burc = (gun <= 20) ? "Balik" : "Koc";
            else gecerliTarih = false;
        } else if (ay == 4) {
            if (gun >= 1 && gun <= 30) burc = (gun <= 20) ? "Koc" : "Boga";
            else gecerliTarih = false;
        } else if (ay == 5) {
            if (gun >= 1 && gun <= 31) burc = (gun <= 21) ? "Boga" : "Ikizler";
            else gecerliTarih = false;
        } else if (ay == 6) {
            if (gun >= 1 && gun <= 30) burc = (gun <= 22) ? "Ikizler" : "Yengec";
            else gecerliTarih = false;
        } else if (ay == 7) {
            if (gun >= 1 && gun <= 31) burc = (gun <= 22) ? "Yengec" : "Aslan";
            else gecerliTarih = false;
        } else if (ay == 8) {
            if (gun >= 1 && gun <= 31) burc = (gun <= 22) ? "Aslan" : "Basak";
            else gecerliTarih = false;
        } else if (ay == 9) {
            if (gun >= 1 && gun <= 30) burc = (gun <= 22) ? "Basak" : "Terazi";
            else gecerliTarih = false;
        } else if (ay == 10) {
            if (gun >= 1 && gun <= 31) burc = (gun <= 22) ? "Terazi" : "Akrep";
            else gecerliTarih = false;
        } else if (ay == 11) {
            if (gun >= 1 && gun <= 30) burc = (gun <= 21) ? "Akrep" : "Yay";
            else gecerliTarih = false;
        } else if (ay == 12) {
            if (gun >= 1 && gun <= 31) burc = (gun <= 21) ? "Yay" : "Oglak";
            else gecerliTarih = false;
        } else {
            gecerliTarih = false;
        }

        if (gecerliTarih) {
            System.out.println("Burcunuz: " + burc);
        } else {
            System.out.println("Gecersiz tarih girdiniz.");
        }

        input.close();
    }
}
