import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double acilisUcreti = 10.0;
        double kmBasiUcret = 2.20;
        double minimumUcret = 20.0;

        System.out.print("Gidilen mesafeyi km cinsinden girin: ");
        double km = input.nextDouble();

        double tutar = acilisUcreti + (km * kmBasiUcret);
        double odenecekTutar = tutar < minimumUcret ? minimumUcret : tutar;

        System.out.println("Taksimetre tutari: " + odenecekTutar + " TL");

        input.close();
    }
}
