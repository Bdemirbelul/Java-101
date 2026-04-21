import java.util.Scanner;

public class AtmProjesiSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanici Adiniz : ");
            userName = input.nextLine();

            System.out.print("Parolaniz : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");

                do {
                    System.out.println("1-Para yatirma");
                    System.out.println("2-Para cekme");
                    System.out.println("3-Bakiye sorgula");
                    System.out.println("4-Cikis yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktari : ");
                            int yatirilan = input.nextInt();
                            balance += yatirilan;
                            System.out.println("Guncel bakiyeniz : " + balance);
                            break;
                        case 2:
                            System.out.print("Para miktari : ");
                            int cekilen = input.nextInt();
                            if (cekilen > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= cekilen;
                                System.out.println("Guncel bakiyeniz : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar gorusmek uzere.");
                            break;
                        default:
                            System.out.println("Gecersiz secim yaptiniz.");
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur. Lutfen banka ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan hakkiniz : " + right);
                }
            }
        }

        input.close();
    }
}
