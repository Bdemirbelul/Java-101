import java.util.Scanner;

public class EtkinlikOnermeProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sicakligini girin: ");
        int sicaklik = input.nextInt();

        // 1) Klasik if-else if zinciri
        if (sicaklik < 5) {
            System.out.println("Onerilen etkinlik: Kayak");
        } else if (sicaklik <= 15) {
            System.out.println("Onerilen etkinlik: Sinema");
        } else if (sicaklik <= 25) {
            System.out.println("Onerilen etkinlik: Piknik");
        } else {
            System.out.println("Onerilen etkinlik: Yuzme");
        }

        // 2) Alternatif cozum: Aralik kontrolunu ayri if'lerle yazma
        System.out.println("Alternatif kontrol sonucu:");
        if (sicaklik < 5) {
            System.out.println("Kayak");
        }
        if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinema");
        }
        if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Piknik");
        }
        if (sicaklik > 25) {
            System.out.println("Yuzme");
        }

        input.close();
    }
}
