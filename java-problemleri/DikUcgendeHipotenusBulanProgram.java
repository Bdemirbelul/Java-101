import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. dik kenari girin: ");
        double dikKenar1 = input.nextDouble();

        System.out.print("2. dik kenari girin: ");
        double dikKenar2 = input.nextDouble();

        double hipotenus = Math.sqrt((dikKenar1 * dikKenar1) + (dikKenar2 * dikKenar2));
        System.out.println("Hipotenus = " + hipotenus);

        System.out.print("Ucgenin 1. kenarini girin (a): ");
        double a = input.nextDouble();

        System.out.print("Ucgenin 2. kenarini girin (b): ");
        double b = input.nextDouble();

        System.out.print("Ucgenin 3. kenarini girin (c): ");
        double c = input.nextDouble();

        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Ucgenin cevresi = " + (2 * u));
        System.out.println("Ucgenin alani = " + alan);

        input.close();
    }
}
