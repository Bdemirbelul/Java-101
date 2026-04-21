import java.util.Scanner;

public class SifreSifirlamaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String dogruKullaniciAdi = "patika";
        String dogruSifre = "java123";

        System.out.print("Kullanici adi: ");
        String kullaniciAdi = input.nextLine();

        System.out.print("Sifre: ");
        String sifre = input.nextLine();

        if (kullaniciAdi.equals(dogruKullaniciAdi) && sifre.equals(dogruSifre)) {
            System.out.println("Giris yapildi.");
        } else {
            System.out.println("Kullanici adi veya sifre yanlis.");
            System.out.print("Sifrenizi sifirlamak ister misiniz? (evet/hayir): ");
            String cevap = input.nextLine();

            if (cevap.equalsIgnoreCase("evet")) {
                System.out.print("Yeni sifre giriniz: ");
                String yeniSifre = input.nextLine();

                if (yeniSifre.equals(dogruSifre)) {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                } else {
                    System.out.println("Sifre olusturuldu.");
                }
            } else {
                System.out.println("Sifre sifirlama islemi iptal edildi.");
            }
        }

        input.close();
    }
}
