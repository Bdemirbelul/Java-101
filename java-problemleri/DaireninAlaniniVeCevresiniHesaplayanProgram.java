import java.util.Scanner;

public class DaireninAlaniniVeCevresiniHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;

        System.out.print("Dairenin yaricapini girin: ");
        double r = input.nextDouble();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alani = " + alan);
        System.out.println("Dairenin cevresi = " + cevre);

        System.out.print("Merkez aciyi girin (derece): ");
        double alpha = input.nextDouble();

        double daireDilimiAlani = (pi * r * r * alpha) / 360;
        System.out.println("Daire diliminin alani = " + daireDilimiAlani);

        input.close();
    }
}
